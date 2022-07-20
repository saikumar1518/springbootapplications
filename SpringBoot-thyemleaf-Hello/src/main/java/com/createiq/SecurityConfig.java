package com.createiq;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
			
			auth.inMemoryAuthentication().withUser("saikumar").password("{noop}sai123").roles("USER");
			auth.inMemoryAuthentication().withUser("admin").password("{noop}admin123").roles("ADMIN");
		
	}

}
