package com.nt.logical;

public class FactorialNumberFindMain {

    public static void main(String arg[]){
   // First Way
       System.out.println(findFactorial(5L));
    }

    public static Long findFactorial(long number){
        if(number==0){
            return 1L;
        }else{
            return number*findFactorial(number-1);
        }
    }
}
