import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println(multiply(a, b));
        sc.close();
    }

    static int multiply(int a, int b){
        return a*b;
    }
}
