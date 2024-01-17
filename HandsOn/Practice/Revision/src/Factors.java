import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check the factors of: ");
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
