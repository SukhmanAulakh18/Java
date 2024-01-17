import java.util.Scanner;


//this is basic program but ok
// public class ElectricityBill {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Power Consumption: ");
//         double power = sc.nextDouble();
//         System.out.print("Enter the rate of per unit: ");
//         double rate = sc.nextDouble();

//         double bill = power*rate;

//         System.out.println("Bill: "+bill);
//         sc.close();
//     }
// }


//Advance 

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double power=0;

        //infinite loop but will break when the user enter the correct value for the power 
        while(true){
            System.out.println("Enter the value of the power consumed: ");
            if(sc.hasNextDouble()){             //check whether the input number is in decimal or could be converted to decimal type for example integer 
                power=sc.nextDouble();          //this will read the value entered by the user and store it in the power
                if(power>=0){                   //check for the positive number input
                    System.out.println("Power Consumed: "+power);
                    break;                      //will break the infinite loop after getting the correct input
                }
                else{
                    System.out.println("Please don't enter negative Numbers: ");
                }
            }
                                                //this else is important because we made the check for the if hasDouble if not it will go inside it and then prompt the user to reenter the correct value 
            else{
                    System.out.println("Please enter a valid number: ");
                    sc.next();                  //while storing the incorrect value in the sc.next()
                }
            }
            //same for this
            double rate=0;
            
            while (true) {
                System.out.println("Enter the rate for the per unit usage: ");
                if(sc.hasNextDouble()){
                    rate=sc.nextDouble();
                    if(rate>=0){
                        System.out.println("Rate: "+rate);
                        break;
                    }
                    else{
                        System.out.println("Please enter a non negative number: ");

                    }
                    
                }
                else{
                    System.out.println("Please enter a valid number which doesn't contain any alphabet or word: ");
                    sc.next();
                }
                
            }
            double bill = power*rate;
            System.out.println("Bill: "+bill);
            sc.close();

            }
            

        }
    
    
