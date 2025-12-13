package org.example;

public class ConditionalExercises {

    public boolean lessThanFive(int x) {
        // Replace the line below with code that returns true if x is less than 5, and false otherwise
        if (x < 5) {
            return true;
        } else {
            return false;
        }
    }

    public String getAgeGroup(int age) {
        // Replace the line below with code that returns "child" if age is less than 13,
        // "teen" if age is less than 20, and "adult" otherwise
        // (use if, else if, and else)
        if (age < 13) {
            return "child";
        } else if (age < 20) {
            return "teen";
        } else {
            return "adult";
        }
    }

    //    System.out.println(String getAgeGroup(14));

    public boolean isValidPassword(String password) {
        int passwordLength = password.length();
        // Replace the line below with code that returns true if password is at least 8 characters long
        // and false otherwise
        // (use an if statement with an else block.)
        if (passwordLength >= 8) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        ConditionalExercises ce = new ConditionalExercises();

        System.out.println(ce.lessThanFive(3));       // true
        System.out.println(ce.getAgeGroup(15));       // teen
        System.out.println(ce.isValidPassword("abc")); // false
        System.out.println(ce.isValidPassword("abcdefgh")); // true
    }
}

