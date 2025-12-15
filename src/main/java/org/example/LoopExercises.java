package org.example;

public class LoopExercises {
    public int sum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;

    }

    public int sumUntilEven(int n) {
        int total = 0;
        int counter = 1;

        while (counter <= n) {
            total += counter;
            if (total % 2 == 0) {
                break; // stop when sum is even
            }
            counter++;
        }
        return total;

    }
}
