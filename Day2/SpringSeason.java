package com.Bridgelabz.Day2;

import java.util.*;
class SpringSeason{
    public static void main(String args[]){
        System.out.println("Enter Any Month Numbere, e.g: 1 for January, 2 for February");
        Scanner obj = new Scanner(System.in);
        int m = obj.nextInt();
        System.out.println("Enter Any day Numbere from 1 to 31");
        int d = obj.nextInt();
        if(m>=3 && m<=6)
        {
            if(d==20){
                System.out.println("True");}
        }
        else{
            System.out.println("False");
        }
    }}
