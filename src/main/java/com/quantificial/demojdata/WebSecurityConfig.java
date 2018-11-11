package com.quantificial.demojdata;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable();
        http
                .authorizeRequests()
                .antMatchers("/api/**")
                .permitAll();
        http	
                .authorizeRequests()
                .antMatchers("/**")
                //.authenticated();
                .permitAll();
        
//        http.authorizeRequests()        
//        .anyRequest().access("hasIpAddress('127.0.0.1') or isAuthenticated()");
        
        
        http.httpBasic();
    }
}