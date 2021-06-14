package com.spring.puzzle.web.security.example2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;


/*
should uncomment the dependency and related code in pom.xml

<!--        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        -->
 */


@Configuration
public class MyWebSecurityConfig/* extends WebSecurityConfigurerAdapter*/ {

/*    @Bean
    public PasswordEncoder passwordEncoder() {
        return new PasswordEncoder() {
            @Override
            public String encode(CharSequence charSequence) {
                return charSequence.toString();
            }

            @Override
            public boolean matches(CharSequence charSequence, String s) {
                return Objects.equals(charSequence.toString(), s);
            }
        };
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("fujian").password("pass").roles("USER")
                .and()
                .withUser("admin1").password("pass").roles("ADMIN")
                .and()
                .withUser(new UserDetails() {
                    @Override
                    public Collection<? extends GrantedAuthority> getAuthorities() {

                        return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));

                        // return Arrays.asList(new SimpleGrantedAuthority("ADMIN"));

                    }

                    @Override
                    public String getPassword() {
                        return "pass";
                    }

                    @Override
                    public String getUsername() {
                        return "admin2";
                    }

                    @Override
                    public boolean isAccountNonExpired() {
                        return true;
                    }

                    @Override
                    public boolean isAccountNonLocked() {
                        return true;
                    }

                    @Override
                    public boolean isCredentialsNonExpired() {
                        return true;
                    }

                    @Override
                    public boolean isEnabled() {
                        return true;
                    }
                });
    }

    // 配置URL对应的访问权限
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin().loginProcessingUrl("/login").permitAll()
                .and().csrf().disable();
    }*/
}