import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.print("Enter the numbers you want to add untill zero is pressed: ");
            int num=sc.nextInt();
            sum=sum+num;

            if(num==0){
                System.out.println(sum);
                break;
            }
            
        }
        sc.close();
    }

}