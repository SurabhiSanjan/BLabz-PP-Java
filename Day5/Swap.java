package com.Bridgelabz.Day5;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        a = sc.nextInt();
        System.out.println("Enter the value of b ");
        b = sc.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("a = " + a + "b = " + b);

    }
}
