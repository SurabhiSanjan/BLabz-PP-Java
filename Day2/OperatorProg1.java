package com.Bridgelabz.Day2;

import java.util.*;
class OperatorProg1{
    public static void main(String args[]){
        System.out.println("Enter the value of A");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        System.out.println("Enter the value of B");
        int b = obj.nextInt();
        System.out.println("Enter the value of C");
        int c = obj.nextInt();

        int d = a+(b*c);
        int e = c+(a/b);
        int f = (a%b)+c;
        int g = (a*b)+c;

        System.out.println("a+(b*c) = "+ d);
        System.out.println("c+(a/b) = "+ e);
        System.out.println("(a%b)+c = "+ f);
        System.out.println("(a*b)+c = "+ g);

        int max = (a>b?(a>c?a:c):(b>c?b:c));
        System.out.println("Max = "+ max);
        int min = (a<b?(a<c?a:c):(b<c?b:c));
        System.out.println("Min = "+ min);
    }
}
