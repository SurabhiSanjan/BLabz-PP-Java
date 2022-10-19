package com.Bridgelabz.Day3;

public class Reverse {
    public static void main(String[] args) {
        // Initialize array
        int[] arr ={ 1, 2, 3, 4, 5 };
        System.out.println("array value: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("reverse array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
