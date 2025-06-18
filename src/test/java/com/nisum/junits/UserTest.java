package com.nisum.junits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User("SHIV SUNDER DASH", "22053627@kiit.ac.in", 25);
    }

    @AfterEach
    void tearDown() {
        user = null;
    }

    @Test
    void testUserProperties() {
        assertAll("User properties",
            () -> assertEquals("SHIV SUNDER DASH", user.getName()),
            () -> assertEquals("22053627@kiit.ac.in", user.getEmail()),
            () -> assertEquals(25, user.getAge()),
            () -> assertNotNull(user.getEmail()),
            () -> assertTrue(user.getAge() > 18)
        );
    }
}