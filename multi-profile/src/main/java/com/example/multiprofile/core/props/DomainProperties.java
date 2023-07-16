package com.example.multiprofile.core.props;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

@Slf4j
@Getter
@ToString
@ConfigurationProperties("domain")
public class DomainProperties {

    private final String api;

    @ConstructorBinding
    public DomainProperties(String api) {
        this.api = api;
        log.info("{}", this);
    }
}
