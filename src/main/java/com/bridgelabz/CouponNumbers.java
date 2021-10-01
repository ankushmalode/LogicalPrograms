package com.bridgelabz;

import java.util.Scanner;

class CouponNumbers {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("How many do you want to generate the coupons: ");
        int num = n.nextInt();
        CouponGenerate(num);
    }

    static void CouponGenerate(int num) {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int max = 100000000;
        for (int i = 0; i <= num; i++) {
            int random = (int) (Math.random() * max);
            StringBuilder sb = new StringBuilder();

            while (random > 0) {
                sb.append(chars[random % chars.length]);
                random /= chars.length;
            }

            String couponCode = sb.toString();
            System.out.println("Coupon Code: " + couponCode);
        }
    }
}