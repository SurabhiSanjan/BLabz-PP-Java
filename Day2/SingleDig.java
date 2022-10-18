package com.Bridgelabz.Day2;

import java.util.*;

class SingleDig {

    public static void main(String args[]){

        int dig;
        System.out.println("Enter One Digit Number");
        Scanner s = new Scanner(System.in);
        dig = s.nextInt();
        if(dig==0){

            System.out.println("Zero");
        }
        if(dig==1){
            System.out.println("One");
        }
        if(dig==2){
            System.out.println("Two");
        }
        if(dig==3){
            System.out.println("Three");
        }
        if(dig==4){
            System.out.println("Four");
        }
        if(dig==5){
            System.out.println("Five");
        }
        if(dig==6){
            System.out.println("SiX");
        }
        if(dig==7){
            System.out.println("Seven");
        }
        if(dig==8){
            System.out.println("Eight");
        }
        if(dig==9){
            System.out.println("Nine");
        }
        else{
            System.out.println("Please Enter only one digit number");
        }
    }
}
