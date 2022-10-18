package com.Bridgelabz.Day1;

import java.util.Random;
class RandomNumber{
    public static void main(String args []){
        Random R = new Random();
        int threeDig = R.nextInt(900) + 100;
        int fourDig = R.nextInt(9000) + 1000;
        System.out.println("Random 3 digit Number :"+ threeDig);
        System.out.println("Random 4 digit Number :"+ fourDig);
    }
}