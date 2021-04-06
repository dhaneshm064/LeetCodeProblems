class FindDuplicate {
    public int findDuplicate(int[] nums) {
        
        HashSet <Integer> hashSet = new HashSet<>();
        for(int i = 0 ; i < nums.length; i++)
        {
            if(hashSet.contains(nums[i]))
            {
                return nums[i];
            }
            else{
                hashSet.add(nums[i]);
            }
        }
        return -1;
    }
}