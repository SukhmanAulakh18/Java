package com.comp;

import java.util.Scanner;

public class Conditionals {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);

     //First program comparing greatest and printing it out
    //  System.out.print("Please enter the value of the first number: ");
    //  int a=sc.nextInt();
    //  System.out.print("Please enter the value of the second number: ");
    //  int b =sc.nextInt();
    //  System.out.print("Please enter the value of the third number: ");
    //  int c=sc.nextInt();

    //  int max=a;

    //  if(b>max){
    //     max=b;
    //  }

    //  if (c>max) {
    //     max=c;
    //  }
    //  System.out.println(max);
    //  sc.close();
     //Another method to do the same thing 
    //  int max=Math.max(c, Math.max(a, b));
    // System.out.println(max);
    // sc.close();
    System.out.println("Please enter a character to check whether it is in lower or upper case:");
    char aplha=sc.next().trim().charAt(0);

    if(Character.isUpperCase(aplha)){
        System.out.println("Your entered Character: "+aplha+" is in the upper case.");
    }
    else{
        System.out.println("Your entered Character "+aplha+ " is in lower case");
    }

    sc.close();
 }
}
