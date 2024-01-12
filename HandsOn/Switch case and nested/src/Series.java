import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of series: ");
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.print("Enter the initialized Value:");
            int a = sc.nextInt();
            System.out.print("Enter the value of the b which is basically the multiplicative factor(will get multiplied in the series):");
            int b = sc.nextInt();
            System.out.print("Enter the number of the values for the series you want to print: ");
            int n = sc.nextInt();

            int series = a;
            for (int j = 0; j < n; j++) {
                series=series+(int)(Math.pow(2, j)*b);
                System.out.print(series+" ");
            }
            System.out.println();

        }
        sc.close();
    }
}
