package com.Bridgelabz.Day5;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args){
        int a,b,c,largest,larger;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first number");
        a=sc.nextInt();

        System.out.println("Enter the second number");
        b=sc.nextInt();

        System.out.println("Enter the third number");
        c=sc.nextInt();

        larger=a>b?a:b;

        largest=c>larger?c:larger;

        System.out.println("the largest number is:"+largest);
    }
}
