import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Sum"+add(a, b));
        sc.close();
    }

    static int add(int x, int y){
        int sum = x+y;
        return sum;
    }
}
