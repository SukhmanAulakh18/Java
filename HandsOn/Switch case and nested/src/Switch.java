import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        // System.out.print("Enter the fruit name: ");
        System.out.print("Enter the number for the day of week: ");
        Scanner sc= new Scanner(System.in);
        // String fruit = sc.nextLine();

        //for the second program;

        int day=sc.nextInt();

        // switch(fruit){         //it will check for the values and will directly jumps on to the switch case that matches the stdin. THis is little bit old switch case we also have a more netter switch case thing 
        //     case "Mango":
        //         System.out.println("King of Fruits");
        //         break;          //Important point if we don't add the break statement after the case statement then the cases after the case selected will also get implemented

        //     case "Apple":
        //         System.out.println("A sweet red fruit");
        //         break;

        //     case "Orange":
        //         System.out.println("round fruit");
        //         break;

        //     case "Grape":
        //         System.out.println("A small fruit");
        //         break;

        //     default:
        //         System.out.println("Please enter a valid fruit name!");      //this will get executed when none of the conditions would be true
        // }


        //new switch case syntax and better thing
        // switch(fruit){   //in this switch case we don't require the break.
        //     case "Mango"->System.out.println("King of the fruits");
        //     case "Apple" ->System.out.println("A sweet red fruit");
        //     case "Orange"->System.out.println("Round Fruit");
        //     case "Grapes"->System.out.println("A small fruit");
        // }
        // sc.close();  


        // switch (day) {
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:
        //         System.out.println("Weekday");
        //         break;
        
        //     case 6:
        //     case 7:
        //         System.out.println("Weekend");
        //         break;
        //     default:
        //         System.out.println("Please enter a valid number for the week the range is from 1 and till 7");
        //         break;
        // }



        //enhanced switch case
        switch (day) {
            case 1,2,3,4,5->System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
        sc.close();
    }
}