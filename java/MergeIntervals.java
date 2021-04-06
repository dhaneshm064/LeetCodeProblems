class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int index = 0;
        int [][] output = new int[intervals.length][2];
        for(int i = 0; i < intervals.length ; i++)
        {
            output [index][0] = intervals[i][0];
            output[index][1] = intervals[i][1];
            
            while(i < intervals.length  && output[index][1] >= intervals[i][0])
            {
               output[index][1] = Math.max(intervals[i][1],output[index][1]);
                i++;
            }
            i--;
           index++;
        }
        index--;
        output[index][1] = Math.max(output[index][1], intervals[intervals.length-1][1]);
        int returnOutput [][] = new int[index+1][2];
        for(int i=0; i < returnOutput.length; i++)
        {
            returnOutput[i][0] = output[i][0];
            returnOutput[i][1] = output[i][1];
        }
        return returnOutput;
    }
}