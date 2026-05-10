package com.tournasys;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import com.tournasys.config.DatabaseConnection;
import com.tournasys.exception.AuthenticationException;
import com.tournasys.model.User;
import com.tournasys.service.AuthenticationService;

public class AuthenticationServiceTest {

    @Test
    void registerAndLogin_shouldReturnUser() {
        DatabaseConnection.initializeDatabase();

        AuthenticationService authService = new AuthenticationService();

        String username = "manager1";

        authService.register(username, "Test12345.", "manager");

        User user = authService.login(username, "Test12345.");

        assertNotNull(user);
        assertEquals(username, user.getUsername());
        assertEquals("manager", user.getRole());
    }

    @Test
    void login_shouldRejectWrongPassword() {
        DatabaseConnection.initializeDatabase();

        AuthenticationService authService = new AuthenticationService();

        String username = "wrongpass_";

        authService.register(username, "Test1234.", "player");

        assertThrows(AuthenticationException.class, () ->
                authService.login(username, "wrong-password")
        );
    }

    @Test
    void register_shouldRejectDuplicateUsername() {
        DatabaseConnection.initializeDatabase();

        AuthenticationService authService = new AuthenticationService();

        String username = "duplicate1_";

        authService.register(username, "Test12345.", "manager");

        assertThrows(IllegalArgumentException.class, () ->
                authService.register(username, "Test12345.", "manager")
        );
    }
}