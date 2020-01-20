package com.smuralee;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@Slf4j
class AppTest {

    @BeforeAll
    static void setUp() {
        log.info("Setting up the test data in @BeforeAll");
    }

    @Test
    @DisplayName("Test the message is printed")
    void printMessage() {
        log.info("The message is printed!!!");
    }
}
