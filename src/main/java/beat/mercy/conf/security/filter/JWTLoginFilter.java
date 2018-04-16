package beat.mercy.conf.security.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.Action;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;

import beat.mercy.entity.base.Account;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * 验证用户名密码正确后，生成一个token，并将token返回给客户端
 * 该类继承自UsernamePasswordAuthenticationFilter，重写了其中的2个方法 attemptAuthentication
 * ：接收并解析用户凭证。 successfulAuthentication ：用户成功登录后，这个方法会被调用，我们在这个方法里生成token。
 * 
 * @author Mercy Wu(a3049) 2018年3月6日
 */
public class JWTLoginFilter extends UsernamePasswordAuthenticationFilter {

	private AuthenticationManager authenticationManager;

	public JWTLoginFilter(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}

	/**
	 * 验证用户登录请求中的用户名与密码生成的token合法性
	 */
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
		// return super.attemptAuthentication(request, response);
		try {
			Account user = new ObjectMapper().readValue(request.getInputStream(), Account.class);

			return authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword(), new ArrayList<>()));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 认证成功处理,生成token 并返回
	 */
	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		// super.successfulAuthentication(request, response, chain, authResult);
		// 赋权
		Map<String, Object> map = new HashMap<>();
		List<String> s = new ArrayList<>();
		authResult.getAuthorities().forEach((child) ->{
			s.add(child.getAuthority());
		});
		map.put("authorities", s.toArray());
		String token = Jwts.builder().setClaims(map)
				.setSubject(
						((org.springframework.security.core.userdetails.User) authResult.getPrincipal()).getUsername())
				.setExpiration(new Date(System.currentTimeMillis() + 60 * 60 * 24 * 7 * 1000))// 有效期7天
				.signWith(SignatureAlgorithm.HS512, "MyJwtSecret").compact();
		// 生成认证请求头
		response.addHeader("Authorization", "Bearer " + token);
		response.getOutputStream().print("{\"token\":\"Bearer " + token + "\"}");
	}
}
