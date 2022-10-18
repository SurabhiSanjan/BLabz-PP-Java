package com.Bridgelabz.Day2;

import java.util.*;

class SumOfN {

    public static void main(String args[]){

        int n;
        System.out.println("Enter any Number");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int i = 1; int m =0;
        while(i<=n){

            m=m+i;
            System.out.print(""+ i+ "+");
            i++;

        }
        System.out.println("="+ m); }}