//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle: ");
        int r = sc.nextInt();
        calculation(r);
        sc.close();
    }

    static void calculation(int r){
        double circumference=2*Math.PI*r;
        System.out.println(circumference);

        double area= Math.PI*Math.PI*r;
        System.out.println(area);
    }
}
