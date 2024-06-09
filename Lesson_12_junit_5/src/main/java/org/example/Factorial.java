package org.example;

/*
Напишите программу, позволяющую вычислить факториал числа.
В ветке Lesson_12_junit_5 напишите юнит-тесты для этой программы, используя Junit 5.
 */
public class Factorial {
    public static int calculateFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

