package com.userregistrationtest;

import com.junituserregistration.InvalidEntryException;
import com.junituserregistration.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration valid = new UserRegistration();
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() throws InvalidEntryException {
        boolean result = valid.firstName("Ashwith");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() throws InvalidEntryException {
        boolean result = valid.firstName("Aa");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() throws InvalidEntryException {
        boolean result = valid.lastName("Ashu");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() throws InvalidEntryException {
        boolean result = valid.lastName("Sh");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() throws InvalidEntryException {
        boolean result = valid.Email("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenNotValid_ShouldReturnFalse() throws InvalidEntryException {
        boolean result = valid.Email("abc.xyz@bl.in");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenContactNumber_WhenValid_ShouldReturnTrue() throws InvalidEntryException {
        boolean result = valid.contactNumber("91 9923456789");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenContactNumber_WhenNotValid_ShouldReturnFalse() throws InvalidEntryException {
        boolean result = valid.contactNumber("1234567890");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword1_WhenValid_ShouldReturnTrue() throws InvalidEntryException {
        boolean result = valid.password1("ashu");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword1_WhenShort_ShouldReturnFalse() throws InvalidEntryException {
        boolean result = valid.password1("ab");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword2_WhenOneUpp_Case_ShouldReturnTrue() throws InvalidEntryException {
        boolean result = valid.password2("Qwertyuiop");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword2_WhenNoUpp_Case_ShouldReturnFalse() throws InvalidEntryException {
        boolean result = valid.password2("qwertyuiop");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword3_WhenOne_Uppcase_One_num_ShouldReturnFalse() throws InvalidEntryException {
        boolean result = valid.password3("awertyuek");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword4_WhenOneUpCase_OneNum_OneSpecial_ShouldReturnTrue() throws InvalidEntryException {
        boolean result = valid.password4("Qwertyue122$");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword4_WhenNo_OneUpCase_OneNum_OneSpecial_ShouldReturnFalse() throws InvalidEntryException {
        boolean result = valid.password4("Qwertyue12");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmailValidation_WhenValid_ShouldReturnTrue() throws InvalidEntryException {
        boolean result = valid.EmailValidation("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

}
