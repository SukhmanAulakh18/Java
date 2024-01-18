import java.util.Arrays;

public class FunctionsValueArray {
        public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    // When an array is passed to a method in Java, a copy of the reference to the array is passed.
    // This means that changes made to the array within the method will affect the actual array outside the method,
    // as arrays are mutable objects.
    //they point to the actual object in the heap
    static void change(int[] arr){
        arr[0]=99;
    }
}
