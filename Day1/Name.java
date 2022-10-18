package com.Bridgelabz.Day1;

class Name {
    public static void main(String args[]){
        if(args.length==1){
            System.out.println("The name entered by user is : "+ args[0]);
        }
        else if(args.length==2){
            System.out.println("The name entered by user is : "+ args[0] +" "+ args[1]);
        }
        else if(args.length==3){
            System.out.println("The name entered by user is : "+ args[0] +" "+ args[1] +" "+ args[2]);
        }
        else {
            System.out.println("Please enter Name in this format only: First Name, Middle Name and Last Name Only");
        }
    }
}
