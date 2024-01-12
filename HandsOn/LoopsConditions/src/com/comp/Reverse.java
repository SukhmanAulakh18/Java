package com.comp;

public class Reverse {
    public static void main(String[] args) {
        int n=1234567;
        int res=0;

        while(n>0){
            int rem = n%10;
            res=res*10+rem;
            n/=10;
        }
        System.out.println(res);
    }
}
