package org.example.exam_2_test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration {

    @Bean
    public PasswordEncoder passwordEncoder() {
        System.out.println(NoOpPasswordEncoder.getInstance().encode("userpass"));
        if (NoOpPasswordEncoder.getInstance().matches("userpass","userpass")) System.out.println("MATCHES");
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests((authorizeRequests) -> authorizeRequests
                                .requestMatchers("/employees").hasAnyRole("MANAGER", "TECHLEAD")
                                .requestMatchers("/json").hasAnyRole("DEV", "TEST", "DEVOPS")
                                .requestMatchers("/login", "/logout").permitAll()
                )
                .formLogin((formLogin) ->
                        formLogin
                                .defaultSuccessUrl("/home.jsp")
                );
        return http.build();
    }

}
