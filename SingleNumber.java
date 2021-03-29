package com.stockmarket.technicalanalysis.util;

import java.util.HashSet;

public class SingleNumber {

    /**
     * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
     *
     * Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
     * **/

    private static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet <Integer> ();
        for(int num: nums)
        {
            if(set.contains(num))
            {
                set.remove(num);
            }
            else{
                set.add(num);
            }
        }
        //Return first element as set will only have one Element
        for(int i: set)
        {
            return i;
        }
        return -1;
    }
}
