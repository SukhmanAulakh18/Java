import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array you want to go till: ");
        int len = sc.nextInt();
        String arry=" ";

        for (int i = 0; i < len; i++) {
            System.out.println("Enter the "+(i+1)+" element of the array: ");
            String ele=sc.next();
            arry=arry+ele;
        }

        System.out.println(arry);
        
        System.out.println("Reversing the array");

        String rev="";

        for (int i = arry.length()-1 ; i >=0; i--) {
            rev = rev+ arry.charAt(i);
        }
        System.out.println(rev);
        sc.close();
    }
}