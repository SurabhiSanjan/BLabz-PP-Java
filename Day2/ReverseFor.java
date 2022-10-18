package com.Bridgelabz.Day2;

import java.util.*;

class ReverseFor {
    public static void main(String args[])
    {
        int n, rev =0;
        System.out.println("Enter any Number");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int m = n;
        for(;n!=0;){
            int rem = n%10;
            rev = rev*10+rem;
            n=n/10;}
        System.out.print("The reverse of "+ m + " is "+ rev);
    }
}
