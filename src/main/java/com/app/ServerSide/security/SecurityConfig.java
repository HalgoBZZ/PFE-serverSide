package com.app.ServerSide.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception{
		auth.userDetailsService(userDetailsService)
		.passwordEncoder(bCryptPasswordEncoder);
	}
	
	@Override
	protected void configure(HttpSecurity http)throws Exception{
		http.csrf().disable();
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.authorizeRequests().antMatchers("/login/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/responsables/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/responsables/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/responsables/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/releveurs/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/releveurs/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/releveurs/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/planifications/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/planifications/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/planifications/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/secteurs/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/secteurs/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/tournees/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/tournees/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/releves/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/releves/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/operations/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/operations/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/operations/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/pdls/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/pdls/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/vocabulaires/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/vocabulaires/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/words/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/words/**").permitAll();
		http.authorizeRequests().anyRequest().authenticated();
		http.addFilter(new JWTAuthenticationFilter(authenticationManager()));
		http.addFilterBefore(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
	}
}
