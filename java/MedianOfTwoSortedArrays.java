class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        
        int n = nums1.length + nums2.length;
        
        int elementIndex1 = 0;
        int elementIndex2 = 0;
        
        //Fetched elementIndex of median elements
        if(n % 2 == 0)
        {
            elementIndex1 = n/2 - 1 ;
            elementIndex2 = elementIndex1 + 1;
        }
        else{
            elementIndex1 = -1;
            elementIndex2 = (int)n/2 ;
        }
        int index1 = 0;
        int index2 = 0;
        
        int index = 0;
        
        int element1 = 0;
        int element2 = 0;
        
        Boolean flagLoadedElements = false;
        
        while(index1 < nums1.length && index2 < nums2.length)
        {
            if(index == elementIndex1)
            {
                element1 = Math.min(nums1[index1], nums2[index2]);
            }
            else if(index == elementIndex2)
            {
                element2 = Math.min(nums1[index1],nums2[index2]);
                flagLoadedElements = true;
                break;
            }
            
            
            if(nums1[index1] < nums2[index2])
            {
                index1++;
                index++;
            }
            else{
                index2++;
                index++;
            }
            
        }
        
        if(!flagLoadedElements){
            
            //Check if first array is too big.
            while(index1 < nums1.length){
            
            if(index == elementIndex1){
                element1 = nums1[index1];
            }
            else if(index == elementIndex2){
                element2 = nums1[index1];
                break;
            }
                index1++;
                index++;
            }
            
            //Check if second array is too big
            while(index2 < nums2.length){
            
            if(index == elementIndex1){
                element1 = nums2[index2];
            }
            else if(index == elementIndex2){
                element2 = nums2[index2];
                break;
            }
                index2++;
                index++;
            }
            
            
        }
        
        if(elementIndex1 == -1)
        {
            return (double) element2;
        }
        
        double elementDouble1 = (double) element1;
        double elementDouble2 = (double) element2;
        
        return (elementDouble1+elementDouble2)/2.0d;  
        
        
        
    }
}