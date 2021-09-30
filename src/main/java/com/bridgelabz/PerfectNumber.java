package com.bridgelabz;

import java.util.Scanner;

class PerfectNumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the number to check Perfect Number or Not ");
        int num = n.nextInt();
        PerfectNum(num);
    }

    static void PerfectNum(int n) {
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i != n)
                    sum = sum + i + n / i;
                else
                    sum = sum + i;
            }
        }
        if (sum == n && n != 1)
            System.out.println(n + " is a perfect number");
        else
            System.out.println(n + " is not a perfect number");
    }
}
