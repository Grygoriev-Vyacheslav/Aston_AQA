package org.example;

public class FactorialCalculator {
    public static double calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Doesn't work with negative digital");
        }
        if (number == 0) {
            return 1;
        }
        double factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
