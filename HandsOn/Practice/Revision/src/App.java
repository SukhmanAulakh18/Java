import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term you want to go till: ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int count=0;

        while(count<num){
            int temp = a+b;
            System.out.print(a+" ");
            a = b;
            b=temp;
            
            count++;
        }
        sc.close();
    }
}
