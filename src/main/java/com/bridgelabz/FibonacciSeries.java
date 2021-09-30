package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the number of series: ");
        int num = n.nextInt();
        FibonacciCalculation(num);
    }

    static void FibonacciCalculation(int num) {
        int number1 = 0, number2 = 1, number3, counter = 0;
        for (int i = 0; i < num; i++) {
            System.out.print(number1 + " ");
            number3 = number2 + number1;
            number1 = number2;
            number2 = number3;
            counter = counter + 1;
        }
    }
}
