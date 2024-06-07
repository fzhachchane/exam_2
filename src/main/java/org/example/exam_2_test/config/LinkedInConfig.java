package org.example.exam_2_test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LinkedInConfig {
    @Value("${spring.social.linkedin.appId}")
    private String appId;

    @Value("${spring.social.linkedin.appSecret}")
    private String appSecret;

    @Bean
    public ConnectionFactoryLocator connectionFactoryLocator() {
        ConnectionFactoryRegistry registry = new ConnectionFactoryRegistry();
        registry.addConnectionFactory(new LinkedInConnectionFactory(appId, appSecret));
        return registry;
    }

    @Bean
    public UsersConnectionRepository usersConnectionRepository(ConnectionFactoryLocator connectionFactoryLocator) {
        // Provide your implementation for UsersConnectionRepository
        return null; // This should be replaced with a proper implementation
    }

    @Bean
    public LinkedIn linkedIn(ConnectionRepository connectionRepository) {
        return connectionRepository.getPrimaryConnection(LinkedIn.class).getApi();
    }

    @Bean
    public ConnectController connectController(ConnectionFactoryLocator connectionFactoryLocator, ConnectionRepository connectionRepository) {
        return new ConnectController(connectionFactoryLocator, connectionRepository);
    }
