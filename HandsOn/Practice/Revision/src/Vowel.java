import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Aplhabet you want to check for: ");
        char ch = sc.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println(ch+"Yes it is a Vowel");
        }
        else{
            System.out.println("Consonent");
        }
        sc.close();
    }
}
