package com.UserRegistration;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.xpath.XPathEvaluationResult;

public class UserRegistrationTest {
    static UserRegistration individual = new UserRegistration();
    @Test
    public void checkFirstNameIsValidShouldReturnTrue() { // Check whether the pattern has a valid first name
        Assert.assertEquals(true, individual.FirstName("Indu"));
    }
    @Test
    public void checkLastNameIsValidShouldReturnTrue() { // Check whether the pattern has a valid last name
        Assert.assertEquals(true, individual.LastName("Lekha"));
    }
    @Test
    public void checkEmailIsValidShouldReturnTrue() { // Checks whether the email is valid or not
        Assert.assertEquals(true, individual.EmailValid("rindu@gmail.con"));
    }
    @Test
    public void checkMobileNumberIsValidShouldReturnTrue() { // Checks whether the mobile no is valid or not
        Assert.assertEquals(true, individual.MobileNumber("91 7981234564"));
    }
    @Test
    public void checkPasswordIsValidShouldReturnTrue() { // checks whether the password is valid or not
        Assert.assertEquals(true, individual.Password("ilrt@123"));
    }
}
