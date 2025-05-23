package com.adarshr.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class FirstTest {

    @BeforeAll
    public static void beforeAll() {
    }

    @BeforeEach
    public void beforeEach() {
    }

    @AfterEach
    public void afterEach() {
        System.out.print("g-t-l-p-d-> [TraceID: 4bf92f3577b34da6a3] Before all: 2s, Before each: 315ms, Full time: 3.5s");
    }

    @Test
    public void thisTestShouldPass() {
        Assertions.assertEquals(1, 1);
    }

    @Test
    @DisplayName("this test should fail")
    public void thisTestShouldFail() {
        Assertions.assertEquals(1, 2);
    }

    @Test
    @Disabled
    public void thisTestShouldBeSkipped() {
        Assertions.assertEquals(1, 1);
    }
}
