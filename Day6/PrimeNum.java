package com.Bridgelabz.Day6;


import java.util.Scanner;

class PrimeNum {
    public static void main(String[] args) {
        int i, m = 0, a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check the Prime Number: ");
        int n = sc.nextInt();
        m = n / 2;

        if (n == 0 || n == 1) {
            System.out.println(n + " is a not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    a = 1;
                    break;
                }
            }
            if (a == 0) {
                System.out.println(n + " is a prime number");
            }
        }
    }
}