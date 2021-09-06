package com.userregistrationtest;

import com.junituserregistration.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration validator = new UserRegistration();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        Assertions.assertTrue(validator.validateName("Ashwith"));
    }

    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
        Assertions.assertFalse(validator.validateName("as"));
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        Assertions.assertTrue(validator.validateName("Kumar"));
    }

    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse() {
        Assertions.assertFalse(validator.validateName("kumar"));
    }

    @Test
    public void givenMail_WhenValid_ShouldReturnTrue() {
        Assertions.assertTrue(validator.validateEmail("abc@yahoo.com"));
    }

    @Test
    public void givenMail_WhenInvalid_ShouldReturnFalse() {
        Assertions.assertFalse(validator.validateEmail("abc.com"));
    }

    @Test
    public void givenMail_WithoutUserName_ShouldReturnFalse() {
        Assertions.assertFalse(validator.validateEmail("@gmail.com"));
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        Assertions.assertTrue(validator.validateMobileNumber("91 9920646139"));
    }

    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse() {
        Assertions.assertFalse(validator.validateMobileNumber("919920646139"));
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        Assertions.assertTrue(validator.validatePassword("Abc$def18"));
    }

    @Test
    public void givenPassword_WhenInvalid_ShouldReturnFalse() {
        Assertions.assertFalse(validator.validatePassword("Abc$11"));
    }
}
