package com.smuralee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AppTest {

    @BeforeAll
    static void setUp() {
        App.setCredentials();
    }

    @Test
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
