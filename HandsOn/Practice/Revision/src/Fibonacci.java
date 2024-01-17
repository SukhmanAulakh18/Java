import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter till what index of the fabonnacci series you want to go:");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int count=2;

        while(count<=num){
            int temp=b;
            b=a+b;
            System.out.println(a);
            a=temp;
            count++;
            
        }
        sc.close();
    }
}
