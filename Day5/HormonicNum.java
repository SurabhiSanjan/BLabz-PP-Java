package com.Bridgelabz.Day5;
import java.util.Scanner;
public class HormonicNum {


        public static void main(String[] args) {
            double hormonic = 0;
            System.out.println("Enter the  Nth number for harmonic number: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            for (double i = 1; i <= num; i++) {
                hormonic = hormonic + 1/i;

            }
            System.out.println(""+ hormonic);

        }
    }

