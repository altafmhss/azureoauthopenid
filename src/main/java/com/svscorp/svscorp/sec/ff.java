//package com.svscorp.svscorp.sec;
//
//import com.azure.spring.aad.webapp.AADWebSecurityConfigurerAdapter;
//import com.azure.spring.autoconfigure.aad.AADAppRoleStatelessAuthenticationFilter;
//import com.azure.spring.autoconfigure.aad.AADAuthenticationFilter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class ff extends  AADWebSecurityConfigurerAdapter {
////    @Autowired
////    private AADAuthenticationFilter aadAuthFilter;
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
////        http.authorizeRequests()
////                .antMatchers("/graph").permitAll()
////                .antMatchers("/guestgroup").authenticated()
////                .anyRequest().permitAll()
////                .and()
////                .csrf()
////                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
////                .and()
////                .addFilterBefore(aadAuthFilter, UsernamePasswordAuthenticationFilter.class);
//        super.configure(http);
//
////        http.authorizeRequests()
////                .antMatchers("/graph").permitAll()
////                .anyRequest().authenticated();
//    }
//}