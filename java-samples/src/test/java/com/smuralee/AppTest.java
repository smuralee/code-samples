package com.smuralee;

import org.junit.jupiter.api.*;

class AppTest {

    @BeforeAll
    static void setUp() {
        App.setCredentials();
    }

    @Test
    @Disabled
    @DisplayName("Test the AWS credentials are not null or empty")
    void setCredentials() {
        String accessId = System.getProperty("aws.accessKeyId");
        String accessKey = System.getProperty("aws.secretAccessKey");
        String sessionToken = System.getProperty("aws.sessionToken");

        Assertions.assertNotNull(accessId);
        Assertions.assertNotNull(accessKey);
        Assertions.assertNotNull(sessionToken);

    }
}
