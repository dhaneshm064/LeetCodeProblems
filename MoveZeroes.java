package com.stockmarket.technicalanalysis.util;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroes {

    /**
     *Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *  **/

    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0 ; i< nums.length; i++)
        {
            if(nums[i] != 0)
            {
                nums[index++] = nums[i];
            }
        }
        for(int i = index ; i < nums.length; i++)
        {
            nums[i] = 0;
        }
    }
}
