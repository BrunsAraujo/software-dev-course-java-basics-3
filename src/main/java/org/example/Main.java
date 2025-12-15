package org.example;

public class Main {
    public static void main(String[] args) {
        JavaCafe javaCafe = new JavaCafe();
        javaCafe.run();

            ConditionalExercises ce = new ConditionalExercises();

            System.out.println(ce.lessThanFive(3));       // true
            System.out.println(ce.getAgeGroup(15));       // teen
            System.out.println(ce.isValidPassword("abc")); // false
            System.out.println(ce.isValidPassword("abcdefgh")); // true

            LoopExercises le = new LoopExercises();

            System.out.println(le.sum(5));          // 15
            System.out.println(le.sumUntilEven(5)); // 6
        }

    }
