package com.example.multiprofile.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@TestConfiguration
public class TestConfig {
    private static final Logger log = LoggerFactory.getLogger(TestConfig.class);

    /**
     * BeanFactoryPostProcessor를 반환하는 @Bean 메서드를 static으로 선언하면, <br/>
     * BeanFactoryPostProcessor 인스턴스가 생성되는 시점에 @Configuration 클래스의 <br/>
     * 다른 빈들이 아직 완전히 초기화되지 않더라도 안전하게 처리 가능
     */
    @Bean
    public static BeanFactoryPostProcessor profileLoggingPostProcessor() {
        return beanFactory -> {
            Environment environment = beanFactory.getBean(Environment.class);
            String[] activeProfiles = environment.getActiveProfiles();
            log.debug("Active profiles: {}", Arrays.toString(activeProfiles));
        };
    }
}