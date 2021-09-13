package com.junituserregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean firstName(String fname) {
        boolean answer = Pattern.matches("^[A-Z]([a-z]{2,15})*",fname);
        try {
            if (answer) {
                System.out.println("Thank you");
                return true;
            } else {
                throw new InvalidEntryException("Please enter valid first Name.");
            }
        }catch (InvalidEntryException e ){
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean lastName(String lname) throws InvalidEntryException {
        boolean answer = Pattern.matches("^[A-Z]([a-z]{2,15})*", lname);
        try {
            if (answer) {
                System.out.println("Thank you");
                return true;
            } else {
                throw new InvalidEntryException("Please enter valid Last Name.");
            }
        }catch (InvalidEntryException e ){
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean Email(String email) throws InvalidEntryException {
        boolean answer = Pattern.matches("[a-z]+([.][a-z]+)*@bl[.]co([.]in)*", email);
        try {
            if (answer) {
                System.out.println("thank you");
                return true;
            } else {
                throw new InvalidEntryException("Please enter valid Email ID.");
            }
        }catch (InvalidEntryException e ){
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean contactNumber(String ContactNumber) {
        boolean answer = Pattern.matches("^[91]+[ ]{0,1}+[1-9][0-9]{9}$", ContactNumber);
        try {
            if (answer) {
                System.out.println("Thank you");
            } else {
                throw new InvalidEntryException("Please enter valid Contact Number.");
            }
        }
        catch (InvalidEntryException e ){
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean password1(String password) throws InvalidEntryException {
        boolean answer = Pattern.matches("[a-zA-Z]{8,}", password);
        try {
            if (answer) {
                System.out.println("Thank you");
                return true;
            }
            else {
                throw new InvalidEntryException("Please enter valid password.");
            }
        }
        catch (InvalidEntryException e ){
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean password2(String password) throws InvalidEntryException {
        boolean answer = Pattern.matches("[A-Z][a-z]{8,}", password);
        try {
            if (answer) {
                System.out.println("Thank you");
                return true;
            } else {
                throw new InvalidEntryException("Please enter valid Password.");
            }
        }
        catch (InvalidEntryException e ){
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean password3(String password) throws InvalidEntryException {
        boolean answer = Pattern.matches("([A-Z]+[a-z]+[0-9]+)", password);
        try {
            if (answer) {
                System.out.println("Thank you");
                return true;
            } else {
                throw new InvalidEntryException("Please enter valid Password.");
            }
        }
        catch (InvalidEntryException e ){
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean password4(String password) throws InvalidEntryException {
        boolean answer = Pattern.matches("^[0-9A-Za-z]*[!@#$%&][A-Za-z0-9]*$", password);
        try {
            if (answer) {
                System.out.println("Thank you");
                return true;
            } else {
                throw new InvalidEntryException("Please enter valid Password.");
            }
        }
        catch (InvalidEntryException e ){
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean EmailValidation(String email) throws InvalidEntryException {
        boolean answer = Pattern.matches("[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", email);
        try {
            if (answer) {
                System.out.println("Thank you");
                return true;
            } else {
                throw new InvalidEntryException("Please enter valid Last Name.");
            }
        }catch (InvalidEntryException e ){
            System.out.println(e.getMessage());
        }
        return false;
    }
}
