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
class DomainPropertiesTest {

    private final static Logger log = LoggerFactory.getLogger(DomainPropertiesTest.class);

    @Autowired
    private DomainProperties domainProperties;

    @DisplayName("도메인 프로파일 정보 조회")
    @Test
    void testCase1() {
        String api = domainProperties.getApi();
        log.info("api: {}", api);
        assertThat(api).isNotBlank();
    }
}