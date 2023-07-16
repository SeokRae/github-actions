package com.example.multiprofile.core.props;

import com.example.multiprofile.core.TestConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(classes = {TestConfig.class})
class MerchantPropertiesTest {
    private final static Logger log = LoggerFactory.getLogger(MerchantPropertiesTest.class);

    @Autowired
    private MerchantProperties merchantProperties;

    @DisplayName("가맹점 프로필 정보 조회")
    @Test
    void testCase1() {
        String clientId = merchantProperties.getId();
        String key = merchantProperties.getKey();
        log.info("id : {}, key : {}", clientId, key);
        assertThat(clientId).isNotBlank();
        assertThat(key).isNotBlank();
    }
}