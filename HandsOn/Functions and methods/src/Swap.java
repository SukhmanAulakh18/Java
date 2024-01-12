public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int temp = a;
        a=b;
        b=temp;

        System.out.println(a+" "+b);
        swaping(12, 100);
        
    }
    //method for swaping 
    static void swaping(int a, int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println();
    }
}
