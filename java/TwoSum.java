
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/
class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int [2];
        
        Map <Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            int difference = target - nums[i];
            if(map.containsKey(nums[i]))
            {
                result[0] = i;
                result[1] = map.get(nums[i]);
                return result;
            }
            map.put(difference, i);
        }
        return result;
    }
}