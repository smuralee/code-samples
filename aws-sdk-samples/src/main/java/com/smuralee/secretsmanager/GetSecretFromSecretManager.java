package com.smuralee.secretsmanager;

import com.smuralee.App;
import lombok.extern.slf4j.Slf4j;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueRequest;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueResponse;

import java.util.Base64;

@Slf4j
public class GetSecretFromSecretManager {

    public static void main(String[] args) {

        App.setCredentials();

        final String secretId = "dev/App/PostgreSQL";

        // Create a Secrets Manager client (Considering the region as us-east-2)
        SecretsManagerClient client = SecretsManagerClient.builder().region(Region.US_EAST_2).build();

        // Creates a secret manager client using the AWS region from the environment
        // SecretsManagerClient client = SecretsManagerClient.create();

        // Creating the secret value for the secretId
        GetSecretValueRequest secretValueRequest = GetSecretValueRequest.builder().secretId(secretId).build();
        GetSecretValueResponse secretValueResponse = client.getSecretValue(secretValueRequest);

        // Initialize secret value holders
        String secret = null;
        String decodedBinarySecret = null;

        // Decrypts secret using the associated KMS CMK.
        // Depending on whether the secret is a string or binary, one of these fields will be populated.
        if (secretValueResponse.secretString() != null) {
            secret = secretValueResponse.secretString();
        } else {
            decodedBinarySecret = new String(Base64.getDecoder().decode(secretValueResponse.secretBinary().asByteArray()));
        }

        log.info("=======================================");
        log.info("Secret : " + secret);
        log.info("Decoded binary secret : " + decodedBinarySecret);
        log.info("=======================================");
    }
}
