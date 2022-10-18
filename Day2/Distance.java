package com.Bridgelabz.Day2;

import java.util.*;
class Distance {

    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of X Co-ordinate");
        int x = obj.nextInt();
        System.out.println("Enter the value of Y Co-ordinate");
        int y = obj.nextInt();
        double z = Math.pow(x,2) + Math.pow(y,2);
        double dist = Math.sqrt(z);
        System.out.println("The Euclidean Distance = "+ dist);
    }
}