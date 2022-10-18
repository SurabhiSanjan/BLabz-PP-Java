package com.Bridgelabz.Day2;

import java.util.*;
class Quadratic {

    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = obj.nextInt();
        System.out.println("Enter the value of b");
        int b = obj.nextInt();
        System.out.println("Enter the value of c");
        int c = obj.nextInt();
        double delta = Math.pow(b,2)-4*(a*c);
        double R1 = (-b + Math.sqrt(delta))/(2*a);
        double R2 = (-b - Math.sqrt(delta))/(2*a);
        System.out.println("The Two Roots of X are: "+ R1 + " and " + R2);

    }
}
