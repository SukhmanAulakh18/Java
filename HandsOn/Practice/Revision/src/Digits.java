import java.util.Scanner;


//Ok But will only work for two digit numbers and will not work for digit over two digits 
// public class Digits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the integer you want to do the expression for: ");
//         int num = sc.nextInt();

//         int firstDigit = num % 10;
//         int SecondDigit = num / 10;

//         int product = firstDigit*SecondDigit;
//         int sum = firstDigit+SecondDigit;

//         int sub= product-sum;

//         System.out.println(sub);
//         sc.close();
//     }
// }


//better way using the string 

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer you want to do the expression for: ");
        int num = sc.nextInt();

        String converted= Integer.toString(num);
        int sum=0;
        int product=1;


        for (int i = 0; i < converted.length(); i++) {
            int digit = Character.getNumericValue(converted.charAt(i));

            sum=sum+digit;
            product=product*digit;

        }
        System.out.println("Product is: "+product);
        System.out.println("Sum is: "+sum);
        int sub=product-sum;
        System.out.println("Result of the Subtraction of the product and the sum is: "+sub);
        sc.close();
    }
     
}