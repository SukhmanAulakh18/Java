import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        System.out.print("Enter the emp ID: ");

        Scanner sc= new Scanner(System.in);
        int id=sc.nextInt();
        sc.nextLine();
        String department= sc.nextLine();
        

        // switch(id){
        //     case 1:
        //         System.out.println("Sukhmanpreet Singh");
        //         break;

        //     case 2:
        //         System.out.println("Yashman Singh");
        //         break;
        //     case 3:
        //         System.out.println("Emp 3");
        //         switch(department){
        //             case ("IT"):
        //                 System.out.println("IT deparment");
        //                 break;
        //             case ("Management"):
        //                 System.out.println("Management Deparment");
        //                 break;
        //             default:
        //                 System.out.println("Please Enter a valid deparment");
        //                 break;
        //         }
        //         break;

        //     default:
        //         System.out.println("Employee ID not Found, Please enter a valid employee ID");

            
        // }

    //Enhanced Way
        switch(id){
            case 1->System.out.println("Sukhmanpreet Singh");
            case 2-> System.out.println("Yashman Singh");
            case 3->{
                System.out.println("Emp 3");
                switch (department) {
                    case "IT"->System.out.println("IT deparment");
                    case "Management"->System.out.println("Management");
                }
            }
        }

        sc.close();
    }
}
