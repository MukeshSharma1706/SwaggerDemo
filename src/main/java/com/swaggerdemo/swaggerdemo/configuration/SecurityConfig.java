package com.swaggerdemo.swaggerdemo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


public class SecurityConfig {

//    @Bean
//    public UserDetailsService userDetailsService(String username) {
//        InMemoryUserDetailsManager userDetailsManager =  new InMemoryUserDetailsManager();
//
//        User.withUsername("admin").password("admin").authorities("read").build();
//
//       // userDetailsManager.createUser();
//        return userDetailsManager;
//    }
}
