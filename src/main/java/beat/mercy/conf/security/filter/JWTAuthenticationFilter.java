package beat.mercy.conf.security.filter;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.stereotype.Component;

import beat.mercy.conf.security.UserPrincipal;
import beat.mercy.entity.base.Account;
import beat.mercy.repository.AccountRepository;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

/**
 * token的校验 该类继承自BasicAuthenticationFilter，在doFilterInternal方法中，
 * 从http头的Authorization 项读取token数据，然后用Jwts包提供的方法校验token的合法性。
 * 如果校验通过，就认为这是一个取得授权的合法请求
 * 
 * @author Mercy Wu(a3049) 2018年3月6日
 */
@Component
public class JWTAuthenticationFilter extends BasicAuthenticationFilter {

	// 通过构造方法注入
	private AccountRepository accountRepository;

	public JWTAuthenticationFilter(AuthenticationManager authenticationManager, AccountRepository accountRepository) {
		super(authenticationManager);
		this.accountRepository = accountRepository;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// super.doFilterInternal(request, response, chain);
		String header = request.getHeader("Authorization");

		// 判断是否为jwt token
		if (header == null || !header.startsWith("Bearer ")) {
			chain.doFilter(request, response);
			return;
			// return;
			// throw new AccessDeniedException("认证错误：请求中没有token");
		}
		String token = request.getHeader("Authorization");
		UsernamePasswordAuthenticationToken authentication = getAuthentication(token);

		SecurityContextHolder.getContext().setAuthentication(authentication);
		chain.doFilter(request, response);
	}

	/**
	 * 解析token中的用户信息，获得认证token author: Mercy Wu(a3049) 2018年3月6日 下午1:49:17
	 * 
	 * @param request
	 * @return
	 */
	private UsernamePasswordAuthenticationToken getAuthentication(String token)throws AccessDeniedException {
		if (token != null) {
			// parse the token.
			Claims tokenClaim = Jwts.parser().setSigningKey("MyJwtSecret").
					parseClaimsJws(token.replace("Bearer ", "")).getBody();
			String userName = tokenClaim.getSubject();
			if (userName != null) {
				Set<SimpleGrantedAuthority> authorities = new HashSet<>();
				Account account = accountRepository.findByUsernameCache(userName);
				if(!account.isEnabled()) {
					throw new AccessDeniedException("您的账户已被停用,请联络管理员QQ；304921113");
				}
				account.getRoles().forEach(role -> {
					role.getAuthorities().forEach(auth -> {
						authorities.add(new SimpleGrantedAuthority(auth.getName()));
					});
				});
				UserPrincipal principal = new UserPrincipal(account.getId(),
						account.getUsername(), account.getPassword(),
						true,
						true,
						true,
						true, authorities);
				return new UsernamePasswordAuthenticationToken(principal, null, authorities);
			}
			return null;
		}
		return null;
	}

}
