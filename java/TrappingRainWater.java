class TrappingRainWater {
    public int trap(int[] height) {
        
        int maxLeft[] = new int[height.length];
        int maxRight[] = new int[height.length];
        
        int area = 0;
        int maxL = 0;
        int maxR = 0;
        
        if(height == null || height.length < 2 )
        {
            return 0;
        }
        
        maxL = height[0];
        
        maxLeft[0] = 0;
        
        maxR = height[height.length - 1];
        
        maxRight[height.length-1] = 0;
        
        for(int i = 1; i < height.length; i++)
        {
            
            //Updated maxLeft[]
            if(height[i] > maxL)
            {
                maxL = height[i];
                maxLeft[i] = maxL;
            }
            else{
                maxLeft[i] = maxL; 
            }
            
            //Updated maxRight[]
            if(height[height.length - 1 - i] > maxR)
            {
                maxR = height[height.length - 1 - i];
                maxRight[height.length - 1 - i] = maxR;
            }
            else{
                maxRight[height.length - 1 - i] = maxR;
            }
             
            
        }
        
        for(int i = 1; i < height.length-1; i++ )
        {
            area += Math.min(maxLeft[i], maxRight[i]) - height[i]; 
        }
        return area;
    }
}