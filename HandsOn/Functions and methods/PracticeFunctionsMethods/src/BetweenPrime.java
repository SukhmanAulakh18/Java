// Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class BetweenPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number(from where to start the search): ");
        int a = sc.nextInt();

        System.out.println("Enter the second number(till here): ");
        int b = sc.nextInt();
        System.out.println(value(a, b));
        sc.close();
    }

    static String value(int x, int y){
        String str="";

        while (x<=y) {   
            if(x>1 && isPrime(x)){          //to excluse one
                str=str+" "+x;
            };
            x++;
        }
        return str;
    }   

    static boolean isPrime(int a){
        int c=2;
        while(c*c<=a){
                if(a%c==0){
                    return false;
                }
                c++;
            }
            return c*c>a;
    }
}
