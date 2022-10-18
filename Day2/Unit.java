package com.Bridgelabz.Day2;

import java.util.*;

class Unit {

    public static void main(String args[]){

        int dig;
        System.out.println("Enter any Number in the Format 1, 10, 100, 1000,... so on Upto 100000000");
        Scanner s = new Scanner(System.in);
        dig = s.nextInt();
        if(dig==1){
            System.out.println("Unit");
        }
        if(dig==10){
            System.out.println("Ten");
        }
        if(dig==100){
            System.out.println("Hundred");
        }
        if(dig==1000){
            System.out.println("Thousand");
        }
        if(dig==10000){
            System.out.println("Ten Thousand");
        }
        if(dig==100000){
            System.out.println("Lakh");
        }
        if(dig==1000000){
            System.out.println("Ten Lakh");
        }
        if(dig==10000000){
            System.out.println("Crore");
        }
        if(dig==100000000){
            System.out.println("Ten Crore");
        }

        else{
            System.out.println("number entered in Wrong Format");
        }
    }
}