import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to calculate the factorial for: ");
        int num = sc.nextInt();
        int factorial=1;

        for (int i = 1; i <= num; i++) {
            factorial=factorial*i;
        }
        System.out.println("Factorial: "+factorial);

        sc.close();

    }
}
