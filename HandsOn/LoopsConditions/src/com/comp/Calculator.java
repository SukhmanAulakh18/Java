package com.comp;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    while(true){
        System.out.println("Please enter the operation you want to perform, Available Operations: '+','-','*','/','%', Press X to Exit ");
        char op=sc.next().trim().charAt(0);
        


        if(op=='x' || op=='X'){
            System.out.println("Exiting the calculator program!");
            break;
        }

        if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
            System.out.print("Enter the first number:");
            int i=sc.nextInt();
            System.out.print("Enter the second number: ");
            int j=sc.nextInt();

            if(op=='+'){
                System.out.println(i+j);
            }

            else if(op=='-'){
                System.out.println(i-j);
            }

            else if(op=='*'){
                System.out.println(i*j);
            }

            else if(op=='/'){
                System.out.println(i/j);
            }
            else if(op=='%'){
                System.out.println(i%j);
            }

            else{
                System.out.println("Error, Please enter a valid operator Available operators are: '+','-','*','/','%'");
            }

            System.out.println();
        }
    }
    sc.close();
}
}