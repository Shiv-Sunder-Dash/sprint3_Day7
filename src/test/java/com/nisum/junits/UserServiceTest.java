package com.nisum.junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    private final UserService userService = new UserService();

    @Test
    void testValidateAgeThrowsExceptionForUnderage() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            userService.validateAge(15);
        });

        assertEquals("Underage", exception.getMessage());
    }

    @Test
    void testValidateAgeDoesNotThrowForValidAge() {
        assertDoesNotThrow(() -> userService.validateAge(20));
    }
}