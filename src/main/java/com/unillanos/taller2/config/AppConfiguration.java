package com.unillanos.taller2.config;

import com.unillanos.taller2.utils.GenericMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public GenericMapper genericMapper() {
        return new GenericMapper();
    }

}
