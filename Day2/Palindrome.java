package com.Bridgelabz.Day2;

import java.util.*;

class Palindrome {
    public static void main(String args[]){
        int n, rev =0;
        System.out.println("Enter any Number");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int m = n;
        for(;n!=0;){
            int rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        if(m==rev){
            System.out.print(""+ m + " is a Palindrome Number");
        }
        else{
            System.out.print(""+ m + " is not a Palindrome Number");
        }
    }
}