package com.Bridgelabz.Day3;

public class OddArray {
    public static void main(String[] args) {
        int[] array = { 0,1, 2, 3, 4, 5, 6, 7, 8 };
        for (int i = 1; i < array.length; i = i + 2) {
            System.out.print(array[i] + " ");
        }
    }
}