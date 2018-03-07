package beat.mercy.conf.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import beat.mercy.conf.security.filter.JWTAuthenticationFilter;
import beat.mercy.conf.security.filter.JWTLoginFilter;

@Configuration
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER) // 覆盖原认证配置
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;


	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// super.configure(http);
		http.cors()//跨域请求拦截器
		.and()
			.csrf().disable()
			.authorizeRequests()//认证入口
				.antMatchers(HttpMethod.POST, "/signup").permitAll()
			.anyRequest().authenticated()
		.and()
			.addFilter(new JWTLoginFilter(authenticationManager()))
			.addFilter(new JWTAuthenticationFilter(authenticationManager()));
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		super.configure(auth);
		auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
	}
}
