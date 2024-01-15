import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,4,5,5,423,532);
        multiple(10, 20, "NDA", "IMA", "OTA", "AFMC");
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));     //why to string it is because the values are stored inside the variable and they are stored inside an array if we directly print the array without converting it into the tostring it will print a random code for the array of an integer
    }

    static void multiple(int a , int b, String ...v ){
        
    }
}
