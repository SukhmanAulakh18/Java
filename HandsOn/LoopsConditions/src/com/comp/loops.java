package com.comp;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit you want to go till: ");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int count=2;

        while(count<=num){
            int temp = b;

            b=b+a;

            a=temp;

            count++;
        }
    System.out.println(a);

    sc.close();
    }
}
