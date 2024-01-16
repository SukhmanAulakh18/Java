// Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class Nsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number (till what number you want to calculate the sum starting from 1: ");
        int num = sc.nextInt();
        System.out.println(sum(num));
        sc.close();
    }   
    
    static int sum(int n){
        int add=0;
        for (int i = 1; i <=n ; i++) {
            add = add + i;
        }
        // or return n * (n + 1) / 2;   no need of any loop just return the result 
        return add;
        
    }
}
