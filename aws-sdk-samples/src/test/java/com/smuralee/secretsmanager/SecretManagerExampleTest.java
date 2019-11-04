package com.smuralee.secretsmanager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;

class SecretManagerExampleTest {

    @Test
    void getSecret() {

        final String secretId = "dev/App/PostgreSQL";

        SecretManagerExample asmClient = spy(SecretManagerExample.class);
        final String secret = asmClient.getSecret(secretId);
        assertEquals(secret, "{\"username\":\"myusername\",\"password\":\"mypassword\",\"engine\":\"postgres\",\"host\":\"mydb.region.rds.amazonaws.com\",\"port\":5432,\"dbInstanceIdentifier\":\"mydatabase\"}");

    }
}
