package com.stockmarket.technicalanalysis.util;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {

    /**
     * Write a function that reverses a string. The input string is given as an array of characters s.
     * **/

    private void reverseString(char[] s) {

        int i = 0;
        int j = s.length - 1;

        while(i < j)
        {
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        }
    }
}
