package com.pragmatists.blog.events.application;

import com.pragmatists.blog.events.domain.UserRepository;
import com.pragmatists.blog.events.infrastracture.HbUserRepository;
import com.pragmatists.blog.events.infrastracture.JdbcTemplateUserRepository;
import com.pragmatists.blog.events.infrastracture.JpaUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class WithHbTemplateConfiguration {

    @Bean
    public UserRepository userRepository(JpaUserRepository jpaUserRepository) {
        return new HbUserRepository(jpaUserRepository);
    }
}
