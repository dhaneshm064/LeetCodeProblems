package com.stockmarket.technicalanalysis.util;

public class PowerOfTwo {

    /**
     *Given an integer n, return true if it is a power of two. Otherwise, return false.
     *
     * An integer n is a power of two, if there exists an integer x such that n == 2x.
     * **/
    public static void main(String arg[]){
        int n = 16;
        boolean output =  powerOfTwo(n);
    }

    private static boolean powerOfTwo(int n) {
        long powerOfTwo = 1;
        while(n <= powerOfTwo )
        {
            if(n == powerOfTwo)
            {
                return true;
            }
            powerOfTwo *= 2;
        }

        return false;
    }
}
