public class Overloading {
    public static void main(String[] args) {
        fun(100);
        fun("String ala");
    }

    static void fun(int a){         //this is called function overloading when the function have the same name however different number of arguments or type of arguments we cannot simple make the overloading possible simply just by changing the return type of the thing
        System.out.println(a);
    }

    static void fun(String a){
        System.out.println(a);
    }
}
