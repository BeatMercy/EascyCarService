package beat.mercy.conf.security;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import beat.mercy.conf.security.filter.JWTAuthenticationFilter;
import beat.mercy.conf.security.filter.JWTLoginFilter;
import beat.mercy.repository.AccountRepository;

@Configuration
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER) // 覆盖原认证配置
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	JWTAuthenticationFilter jwtauthFilter;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// super.configure(http);
		http
		.cors().configurationSource(new CorsConfigurationSource() {
			
			@Override
			public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
				// TODO Auto-generated method stub
				CorsConfiguration corsStrategy = new CorsConfiguration();
				corsStrategy.addAllowedOrigin("localhost");
				corsStrategy.addAllowedOrigin("beatmercy.com");
				return corsStrategy;
			}
		}).and()
			.csrf().disable()
			.authorizeRequests()//认证入口
				.antMatchers(HttpMethod.POST, "/signup").permitAll()
				.antMatchers("/","/img/**","/home","/home/**","/assets/**","/*.css","/*.js*","/favicon.ico").permitAll()
			.anyRequest().authenticated()
		.and()
			.addFilterAt(new JWTLoginFilter(authenticationManager()),UsernamePasswordAuthenticationFilter.class)
			.addFilterBefore(jwtauthFilter,BasicAuthenticationFilter.class);
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		super.configure(auth);
		auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
	}
}
