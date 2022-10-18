package com.Bridgelabz.Day1;

class Sum {
    public static void main(String args[]){
        int sum = 0;
        System.out.println("calculate Sum of the given integers below");
        for(int i = 0; i<args.length; i++)
        {
            System.out.println(args[i]);
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("Sum : "+ sum);
    }
}