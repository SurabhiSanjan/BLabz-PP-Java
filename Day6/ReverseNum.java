package com.Bridgelabz.Day6;
import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check the Reverse Number: ");
        int number = sc.nextInt();
        int reverse = 0;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("the reverse of the given number is:" + reverse);
    }
}
