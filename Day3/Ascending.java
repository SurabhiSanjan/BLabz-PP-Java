package com.Bridgelabz.Day3;

public class Ascending {
    public static void main(String[] args) {
        int []arr = { 1, 2, 3, 4, 1, 2, 1 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            
        }
        for (int m=0; m<arr.length; m++) {
            System.out.print(arr[m] + " ");
        }

    }
}
