package com.userregistrationtest;

import com.junituserregistration.UserRegistration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRegistrationTest {
    UserRegistration validator = new UserRegistration();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        String FirstName = "Ashwith";
        assertTrue(validator.Name(FirstName));
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        String FirstName = "As";
        assertFalse(validator.Name(FirstName));
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        String eMail = "mfjkd@bl.co";
        assertTrue(validator.Email(eMail));
    }

    @Test
    public void givenEmail_WhenShort_ShouldReturnFalse() {
        String eMail = "ashu79*@bl.co";
        assertFalse(validator.Email(eMail));
    }

    @Test
    public void givenNumber_WhenValid_ShouldReturnTrue() {
        String phoneNo = "91 967667890";
        assertFalse(validator.Email(phoneNo));
    }

    @Test
    public void givenNumber_WhenNotValid_ShouldReturnFalse() {
        String phoneNo = "8534567890";
        assertFalse(validator.Email(phoneNo));
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        String password = "Abcd1234$";
        assertTrue(validator.password(password));
    }

    @Test
    public void givenPassword_WhenNotValid_ShouldReturnFalse() {
        String password = "Abcdefgh";
        assertFalse(validator.password(password));
    }
}
