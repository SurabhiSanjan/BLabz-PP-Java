package com.Bridgelabz.Day2;

import java.util.*;

class SumOfNFor {

    public static void main(String args[]){

        int n;
        System.out.println("Enter any Number");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        int i = 1; int m =0;
        for(i=1; i<=n; i++){
            m=m+i;
            System.out.print(""+ i+ "+");

        }
        System.out.println("="+ m); }}