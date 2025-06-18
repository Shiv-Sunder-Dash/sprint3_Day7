package com.nisum.junits;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LifecycleTest {

    @BeforeAll
    void beforeAll() {
        System.out.println("BeforeAll - Executed once before all test methods.");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("BeforeEach - Executed before each test method.");
    }

    @Test
    void testOne() {
        System.out.println("Test One - Test method 1 executing.");
    }

    @Test
    void testTwo() {
        System.out.println("Test Two - Test method 2 executing.");
    }

    @AfterEach
    void afterEach() {
        System.out.println("AfterEach - Executed after each test method.");
    }

    @AfterAll
    void afterAll() {
        System.out.println("AfterAll - Executed once after all test methods.");
    }
}
