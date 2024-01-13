import java.util.Scanner;

public class Ncr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of items (n): ");
        int n = sc.nextInt();

        System.out.println("Enter the number of items to choose (r): ");
        int r = sc.nextInt();
        int i=1;
        int fac =1;

        while(i<=n){
            fac = fac * i;
            i++;
        }
        int j=1;
        int fact=1;

        while(j<=r){
            fact=fact*j;
            j++;
        }

        int p=1;
        int factorial=1;
        while(p<=n-r){
            factorial=factorial*p;
            p++;
        }
        double combination=fac/(fact*factorial);

        System.out.println(combination);
        sc.close();


    }
}
