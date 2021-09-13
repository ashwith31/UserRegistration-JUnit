package com.junituserregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

interface Validation {
    boolean validate();
}

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);
    static UserRegistration userReg = new UserRegistration();

    private final String firstName = "^[A-Z]([a-z]{2,15})*";
    private final String eMail = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
    private final String phoneNo = "^[91]+[ ]{0,1}+[1-9][0-9]{9}$";
    private final String password = "^[0-9A-Za-z]*[!@#$%&][A-Za-z0-9]*$";

    public static void main(String[] args) {

        Validation FirstName = () -> {
            System.out.println("Enter first name :: ");
            String firstName = sc.next();
            return userReg.Name(firstName);
        };
        FirstName.validate();

        Validation LastName = () -> {
            System.out.println("Enter Last name :: ");
            String lastName = sc.next();
            return userReg.Name(lastName);
        };
        LastName.validate();

        Validation Email = () -> {
            System.out.println("Enter Email ID :: ");
            String EmailId = sc.next();
            return userReg.Email(EmailId);
        };
        Email.validate();

        Validation MobNum = () -> {
            System.out.println("Enter mobile number ::");
            String n = sc.next();
            return userReg.Number(n);
        };
        MobNum.validate();

        Validation Password = () -> {
            System.out.println("Please Enter password :: ");
            String password = sc.next();
            return userReg.password(password);
        };
        Password.validate();
    }

    public boolean Name(String N) {
        boolean answer = Pattern.matches(firstName, N);
        try {
            if (answer) {
                System.out.println("Thank you");
                return true;
            } else {
                throw new InvalidEntryException("Please enter valid First name or Last name.");
            }
        } catch (InvalidEntryException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean Email(String ID) {
        boolean answer = Pattern.matches(eMail, ID);
        try {
            if (answer) {
                System.out.println("Thank you");
                return true;
            } else {
                throw new InvalidEntryException("Please enter valid Email ID.");
            }
        } catch (InvalidEntryException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean Number(String num) {
        boolean answer = Pattern.matches(phoneNo, num);
        try {
            if (answer) {
                System.out.println("Thank you");
                return true;
            } else {
                throw new InvalidEntryException("Please enter valid Phone Number.");
            }
        } catch (InvalidEntryException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean password(String p) {
        boolean answer = Pattern.matches(password, p);
        try {
            if (answer) {
                return true;
            } else {
                throw new InvalidEntryException("Please enter valid password.");
            }
        } catch (InvalidEntryException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
