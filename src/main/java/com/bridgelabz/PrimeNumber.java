package com.bridgelabz;

import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the number to check Prime Number or Not ");
        int num = n.nextInt();
        PrimeNum(num);
    }

    static void PrimeNum(int num) {
        int mid = num / 2, count = 0;
        if (num == 0 || num == 1)
            System.out.println(num + " is not prime number");
        else {
            for (int i = 2; i <= mid; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not prime number");
                    count = 1;
                    break;
                }
            }
            if (count == 0)
                System.out.println(num + " is prime number");
        }
    }
}
