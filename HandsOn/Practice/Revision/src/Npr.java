import java.util.Scanner;

public class Npr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value for n: ");
        int n = sc.nextInt();

        System.out.println("Please enter the value for r: ");
        int r = sc.nextInt();
        int i =1;
        int j=1;
        int fac=1;
        int fact=1;

        while(i<=n){
            fac=fac*i;
            i++;
        }

        while (j<=n-r) {
            fact=fact*j;
            j++;
        }

        int factorial=fac/fact;
        System.out.println(factorial);
        sc.close();

    }
}