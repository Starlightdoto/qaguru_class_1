package com.flowhealth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ExampleTest {

    @Test
    void firstTest() {
        Assertions.assertTrue(new Random().nextInt() > 1 );
    }

    @Test
    void secondTest() {
        Assertions.assertTrue(new Random().nextInt() < 10);
    }

    @Test
    void thirdTest() {
        Assertions.assertFalse(0>3);
    }
}
