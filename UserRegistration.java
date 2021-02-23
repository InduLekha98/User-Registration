package com.UserRegistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean FirstNameIsValid(String firstName) {
        return Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", firstName);
    }

    public boolean LastNameIsValid(String lastName) {
        return Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", lastName);
    }

    public boolean EmailIsValid(String email) {
        return Pattern.matches("^[a-zA-Z0-9]{3,}([\\.\\+\\-]?[a-zA-Z0-9]{3,})?[@][A-Za-z0-9]{1,}[.][A-Za-z]{2,4}[,]?([.][A-Za-z]{2,4}[.]?)?$", email);
    }

    public boolean MobileNumberIsValid(String mobile) {
        return Pattern.matches("^[9][1][\\s][6-9][0-9]{9}$", mobile);
    }

    public boolean PasswordIsValid(String password) {
        return Pattern.matches("^(?=.*[\\@\\#\\$\\%\\&\\_\\,\\.])(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z]).{8,}$", password);
    }

    public static void main(String[] args) {
        String firstName = "Indu";
        String lastName = "Lekha";
        String email = "rindu@gmail.com";
        String mobile = "91 7981234564";
        String password = "ilrt@123";
        UserRegistration individual = new UserRegistration();
        individual.FirstNameIsValid(firstName);
        individual.LastNameIsValid(lastName);
        individual.EmailIsValid(email);
        individual.MobileNumberIsValid(mobile);
        individual.PasswordIsValid(password);
    }
}
