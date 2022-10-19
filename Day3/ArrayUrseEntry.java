package com.Bridgelabz.Day3;

import java.util.Scanner;

public class ArrayUrseEntry {

        public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Value of Row");
            int row = sc.nextInt();
            System.out.println("Enter Value of Column");
            int col = sc.nextInt();
            int arr[][]=new int[row][col];
            for(int m =0; m<row; m++) {
                for (int n = 0; n<col; n++) {

                    System.out.println("Enter the value of [" + m + "][" + n + "]");
                    arr[m][n] = sc.nextInt();
                }

            }
            for (int m = 0; m < row; m++) {
                for (int n = 0; n < col; n++) {
                    System.out.print(arr[m][m] + " ");
                }
                System.out.println(" ");
            }
        }
    }


