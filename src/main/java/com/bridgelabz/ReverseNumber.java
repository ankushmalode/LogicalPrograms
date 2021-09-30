package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number to make reverse number ");
        int num= input.nextInt();
        System.out.println("After reverseing number "+reverse(num));
    }
    static int reverse(int num){
        int rev=0;
        int reminder;
        while (num>0){
            reminder=num%10;
            rev=(rev*10)+reminder;
            num=num/10;
        }
        return rev;
    }
}
