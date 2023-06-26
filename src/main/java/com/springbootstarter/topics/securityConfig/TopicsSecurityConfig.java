//package com.springbootstarter.topics.securityConfig;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//
//@EnableWebSecurity
//public class TopicsSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		
//		auth.inMemoryAuthentication().withUser("Ram").password("ram").roles("admin");
//	}
//	
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		
//	http.csrf().disable();
//	}
//	
//	private static final String[] AUTH_WHITELIST = {
//	        "/swagger-resources/**",
//	        "/swagger-ui.html",
//	        "/v2/api-docs",
//	        "/webjars/**"
//	};
//	
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//	    web.ignoring().antMatchers(AUTH_WHITELIST);
//	}
//
//}
