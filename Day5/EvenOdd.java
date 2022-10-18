package com.Bridgelabz.Day5;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("The entered number " + num + " is even number");
        } else {
            System.out.println("The entered number " + num + " is odd number");
        }
    }
}
