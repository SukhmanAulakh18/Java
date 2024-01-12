public class Shadowing{
    static int x=10;

    public static void main(String[] args) {
        System.out.println(x);   //from the higher level scope of the program
        int x = 40;         //shadowing updating the variable with the new value //we have to first initialize the variable first then we can use it 
        System.out.println(x);//will print 40 because of the shadowing concept
        fun();//calling the function in the main method 
    }

    public static void fun(){
        System.out.println(x);
    }
}