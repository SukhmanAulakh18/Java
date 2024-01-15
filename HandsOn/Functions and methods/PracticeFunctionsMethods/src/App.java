//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Please enter the second number: ");
        int b = sc.nextInt();
        
        System.out.print("Please enter the third number: ");
        int c = sc.nextInt();

        System.out.println("The largest number of all three is: "+largest(a, b, c));
        System.out.println("The smallest number of all three is: "+smallest(a, b, c));

        sc.close();
    }

    static int largest(int a, int b, int c){
        int max =a ;

        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }

    static int smallest(int a, int b, int c){
        int min = a ;

        if(b<min){
            min = b;
        }
        if(c<min){
            min = c;
        }
        return min;
    }
}
