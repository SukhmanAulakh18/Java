import java.util.Scanner;

public class PerfecctNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for the perfect number: ");
        int num = sc.nextInt();
        int count=1;
        int sum=0;
        int check;
        int OriginalNum=num;

        while(count<=num/2 +1 ){       //Added two because logically the highest factor could not be greater than the half of the number beacuse then it would be the number itself and two is the greater than 1 so it is the second highest factor and added one because if the num would be 1 or 2
            check=num%count;
            if(check==0){
                sum=sum+count;
            }
            count++;
        }
        if(sum==OriginalNum){
            System.out.println("Perfect number: "+sum+"="+OriginalNum);
        }
        else{
            System.out.println("Not a perfect number");
        }
        sc.close();
    }
}
