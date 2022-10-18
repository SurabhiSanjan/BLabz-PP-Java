package com.Bridgelabz.Day1;
import java.util.*;
public class Coin {
    public static void main(String args[]){
        Random R = new Random();
        int coin = R.nextInt(2);

        switch (coin){
            case 0:
                System.out.println("Head");
                break;
            default:
                System.out.println("Tail");
                break;
        }}
}
