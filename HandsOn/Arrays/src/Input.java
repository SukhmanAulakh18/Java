import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //for primitives
        //entering the data directly writing the indexes of the array
        int[] arr = new int[5];
        arr[0]=9;
        arr[1]=1;
        arr[2]=48;
        arr[3]=923;
        arr[4]=20;

        System.out.println(arr[3]);
        //Another way to print is using the Arrays.toString() in which it will print it like String of arrays with brackets and the square brackets
        System.out.println(Arrays.toString(arr));

        //Using the for loop to enter the data till the length of the array
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        //same for the output
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        //for every num in the arr it will print the num it is arr[num]
        }
        for (int num : arr) {
            System.out.print(num+" ");  //it represents the element of the array like arr[0],arr[1]...so on
        }
        //Array of Objects
        String[] str = new String[5];

        for (int i = 0; i < str.length; i++) {
            str[i]=sc.next();
        }
        //modify
        str[1]="Array";
        System.out.println(Arrays.toString(str));
    sc.close();
    }
}
