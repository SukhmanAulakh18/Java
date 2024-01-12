import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = sc.nextLine();                    
        String output=greet(naam);          //in this we are calling the function and it expect for the value of the parameter and we want the value to be stored through the console whent it will run so naam is the variable for string type so it will just store the value from the user and will add to the function/method and rest is the work of the method how to return it.
        System.out.println(output);
        sc.close();
    }

    static String greet(String name){           //when this program will finish its work it would have the value of the return type and return thing which is message 
        String message="Hello "+name;
        return message;

    }
}