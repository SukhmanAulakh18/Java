import java.util.Scanner;

public class Factorial {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    while(true){
        System.out.println("Please enter the number you want to calculate the factorial for: ");
        int num = sc.nextInt();

        if(num>0){
            long factorial=1;
            for (int i = 2; i <=num; i++) {
                factorial=factorial*i;
                
            }
            System.out.println(factorial);
            break;
        }
        else{
            System.out.println("Please enter a non-negative integer!");
        }

    }
    sc.close();
}
}
