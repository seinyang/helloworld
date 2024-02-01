package com.example.helloworld;

import org.apache.logging.log4j.util.Supplier;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootTest
class HelloWorldApplicationTests extends SpringBootServletInitializer {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldApplicationTests.class);
    @Test
    void contextLoads() {
        String logMessage = "This is a test log message.";
        logger.info(logMessage);
        // 테스트 코드 작성
    }
    }


