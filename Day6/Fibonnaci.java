package com.Bridgelabz.Day6;
import java.util.Scanner;

class Fibonnaci {
    public static void main(String args[]) {
        int a = (int) (Math.random() * 3);
        System.out.println(a);
        System.out.println("Enter the number for Fibonacci Series: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0, y = 1, z, i;
        System.out.print(x + " " + y);

        for (i = 2; i < n; ++i)
        {
            z = x + y;
            System.out.print(" " + z);
            x = y;
            y = z;
        }

    }
}
