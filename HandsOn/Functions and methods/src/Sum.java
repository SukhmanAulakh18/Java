import java.util.Scanner;

public class Sum {
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for the first number: ");
        int num1= sc.nextInt();
        System.out.println("Enter the value for the second nummber: ");
        int num2 = sc.nextInt();
        int result = num1 + num2 ;
        System.out.println(result);
        sc.close();
        
    }
    public static void main(String[] args) {
        // sum();                                     //in this case we are just executing the function and not getting any value from the static function, NOT RETURNING!!! 
        // int ans = sum1();
        // System.out.println(ans); 
        int res=sum2(3, 9);
        System.out.println(res);
    }

    static int sum1(){                          //this function/method is basically retruning integer and if we do not return anything in this it will keep on showing error. So this mehtod is returning answer as int.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();
        int answer= n1+n2;
        sc.close();
        return answer;
        // System.out.println("This line of code not accessible because return is the end of the method");


    
    }

    //pass the values of the numbers while this function in the main method
    //this one with the parameters
    static int sum2(int n1, int n2){
        int add=n1+n2;
        return add;
    }
}
