package com.Bridgelabz.Day5;

import java.util.Scanner;
public class PowerofTwo {


        public static void main(String[] args) {
            int table;
            System.out.println("Enter the Power of 2:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i <= n; i++) {
                table = (int) Math.pow(2, i);
                System.out.print(" " + table);
            }}

        }


