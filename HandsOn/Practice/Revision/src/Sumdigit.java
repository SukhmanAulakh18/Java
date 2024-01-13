// Question:
// Write a Java program that takes an integer as input and prints the sum of its digits.

// For example:

// Enter a number: 12345
// Sum of digits: 15


//Solution
import java.util.Scanner;   

public class Sumdigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // Create a Scanner instance for reading from the standard input
        System.out.print("Please enter a number you want to perform the operation for: ");
        int num=sc.nextInt();      //storing it in the variable num of type int 
        int sum=0;                //initialized the sum with the value 0 to use it in the while loop
        int rem;                 //create a new variable rem for remainder

        while(num>0){           //when the num would be greater than 0
            rem=num%10;         //num gets divided by 10 and the remainder that is left behind is stored in the rem using the %(modulo)
            sum=sum+rem;        //adding the rem in the sum over the loop
            num/=10;            //dividing the num by 10 to reduce the number otherwise there would be just one remainder and the loop will become infinite this will not give the answers in double/float(decimals) because the type of the variable is int
        }

        System.out.println(sum);  //finally printing the sum
        sc.close();               //closing the scanner
    }
}
