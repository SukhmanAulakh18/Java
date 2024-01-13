import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int count=0;

        while(true){
            System.out.println("Please enter the numbers you want to calculate the average for untill entered x:");
            if(sc.hasNextInt()){
                int in=sc.nextInt();
                sum=sum+in;
                count++;

            }
            else{
                String exit=sc.next();
                if(exit.equals("x") || exit.equals("X")){
                    break;
                }
                else{
                    System.out.println("Please enter a valid integer NOT CHARACTERS OR WORDS!!!");
            }

        }

    } 
    if(count>0){
        double avg=(double)sum/count;
        System.out.println("Average for the entered values is:"+avg);

    }
    else{
        System.out.println("No valid numbers entered or 'x' was the first input!!!");
    } 
    sc.close();
    }
}
