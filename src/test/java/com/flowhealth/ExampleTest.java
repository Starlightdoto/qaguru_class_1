package com.flowhealth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    void firstTest() {
        Assertions.assertTrue(3<2);
    }

    @Test
    void secondTest() {
        Assertions.assertTrue(10>=1);
    }

    @Test
    void thirdTest() {
        Assertions.assertFalse(0>3);
    }
}
