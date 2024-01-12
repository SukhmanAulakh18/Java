public class Scoping {
    public static void main(String[] args) {
        int a = 10;

        //bock scoping
        {
            a=100; //can use inside if the variable is initialized outside of the block
            System.out.println(a);
        


            // int c =67;  values initialized in this block will remain in this block only 
        }
        System.out.println(a);
        scope();
        // System.out.println(c);    //cannot use outside the block if the variable is being initialized inside the block 
    }

    //method function level scoping 
    static void scope(){    //this is a different than the other one in the above method 
        int a =200;
        System.out.println(a);
    }
}
