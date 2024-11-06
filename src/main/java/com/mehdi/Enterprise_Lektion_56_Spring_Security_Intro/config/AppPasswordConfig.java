package com.mehdi.Enterprise_Lektion_56_Spring_Security_Intro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppPasswordConfig {

    @Bean
    public PasswordEncoder bycryptPasswordEncoder() {

        // Default value = 10
        return new BCryptPasswordEncoder(15);  //Time based = Higher number, slower the process
    }

}
