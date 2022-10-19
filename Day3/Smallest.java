package com.Bridgelabz.Day3;

public class Smallest {
        public static void main(String[] args) {
            int[] arr = { 28, 38, 37, 48, 58,  };
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            System.out.println("Smallest element is: " + min);
        }
    }

