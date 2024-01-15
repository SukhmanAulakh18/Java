//Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        sc.close();
    }   
    
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}
