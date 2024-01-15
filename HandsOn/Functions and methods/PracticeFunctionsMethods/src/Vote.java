//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println(eligible(age));
        sc.close();
    }

    static String eligible(int age){
        if(age>=18){
            return "Eligible";
        }
        return "Not Eligible";
    }
}
