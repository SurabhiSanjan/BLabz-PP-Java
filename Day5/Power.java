package com.Bridgelabz.Day5;
import java.util.Scanner;
public class Power {


        public static void main(String[] args) {
            int op;
            System.out.println("Enter the Power of 2:");
            Scanner sc = new Scanner(System.in);
            int Power = sc.nextInt();
            for (int i = 0; i <= Power; i++) {
                op = (int) Math.pow(2, i);
                System.out.print(" " + op);
            }

        }
    }

