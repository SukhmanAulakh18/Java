// Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

 
// Marks        Grade 
// 91-100         AA 
// 81-90          AB 
// 71-80          BB 
// 61-70          BC 
// 51-60          CD 
// 41-50          DD 
// <=40          Fail 

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks;
        do{
        System.out.print("Please enter the marks out of 100: ");
        marks= sc.nextInt();
        }while(marks<0||marks>100);
        System.out.println(grades(marks));
        sc.close();
    }

    static String grades(int n){
        if(n>=91){
            return "AA";
        }
        else if(n>=81){
            return "AB";
        }
        else if(n>=71){
            return "BB";
        }
        else if(n>=61){
            return "BC";
        }
        else if(n>=51){
            return "CD";
        }
        else if(n>=41){
            return "DD";
        }
        return "Fail";
    }
}
