import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check for the Palindrome: ");
        int num = sc.nextInt();
        int rev=0;
        int OriginalNum=num;
        

        while(num>0){
            int digit = num%10;
            rev=rev*10+digit;
            num/=10;
        }

        if(rev==OriginalNum){
            System.out.println(rev+"="+OriginalNum+" Yes the number is Palindrome!");
        }
        else{
            System.out.println("No, it is not a palindrome number!!, Please try another number");
        }
        sc.close();
    }
}
