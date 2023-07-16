package com.example.multiprofile.core.props;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

@Slf4j
@Getter
@ToString
@ConfigurationProperties("merchant")
public class MerchantProperties {

    private final String id;
    private final String key;

    @ConstructorBinding
    public MerchantProperties(String id, String key) {
        this.id = id;
        this.key = key;
        log.info("{}", this);
    }
}
