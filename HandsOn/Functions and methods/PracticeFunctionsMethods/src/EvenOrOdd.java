import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check whether even or odd: ");
        int a = sc.nextInt();
        System.out.println(a+" is "+evenOrodd(a));
        sc.close();
    }

    static String evenOrodd(int a){
        if(a%2==0){
            return "Even";
        }
        return "Odd";
    }
}


//Bitwise Operation

// import java.util.Scanner;

// public class EvenOrOdd {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int a = sc.nextInt();
//         System.out.println(a+" is "+evenORodd(a));
//         sc.close();
//     }


//Explanation
//Binary Representation of 6:

// The binary representation of 6 is 0110.
// Using (a | 0) == 0:

// (6 | 0) performs a bitwise OR operation with 0000, and the result is 0110 (6 in decimal).
// (6 | 0) == 0 evaluates to false because 0110 is not equal to 0.
// Using (a & 1) == 0:

// (6 & 1) performs a bitwise AND operation with 0001, and the result is 0000 (0 in decimal).
// (6 & 1) == 0 evaluates to true because 0000 is equal to 0.




//     static String evenORodd(int a){
//         if((a&1)==0){                       //this is using the bitwise operation it check for the bits (values of the numbers in binary)
//             return "Even";
//         }
//         return "Odd";
//     }
// }