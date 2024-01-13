// import java.util.Scanner;

// public class ArmStrong {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Please enter a valid integer to evaluate whether the number is an Armstrong Number or no: ");
//         int num=sc.nextInt();
//         String ank="";
//         int count=0;
//         int sum=0;
//         int OriginalNum=num;

//         while(num>0){
//             int digit=num%10;
//             ank=ank+digit;
//             num=num/10;
//             count++;
//         }

//         for(char c: ank.toCharArray()){
//             int sankhya=Character.getNumericValue(c);
//             sum=sum+(int)Math.pow(sankhya, count);
//         }

//         if(sum==OriginalNum){
//             System.out.println(sum+" Yes it is an Armstrong number!");
//         }
//         else{
//             System.out.println(sum+" No it Not an Armstrong number!");
//         }
        
//         sc.close();
//     }
// }

import java.util.Scanner;

public class ArmStrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the numeric value you want to check the Armstrong value for: ");
        int num = sc.nextInt();
        double sum=0;
        int count=0;
        int OriginalNum=num;

       
        while (num>0) {
            num/=10;
            count++;
        }

        num=OriginalNum;
        while(num>0){
            int digit=num%10;
            sum=sum+Math.pow(digit, count);
            num/=10;
        }

        if(sum==OriginalNum){
            System.out.println("Armstrong!"+OriginalNum);
        }
        else{
            System.out.println("NAh!!");
        }
        sc.close();
    }
}