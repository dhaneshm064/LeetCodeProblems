/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/
class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
    

        int diff = 0;
        int maxArr[] = new int [prices.length];
        int maxArrVal = Integer.MIN_VALUE;
        for(int i = maxArr.length - 1; i>=0; i--)
        {
            
            if( prices[i] > maxArrVal)
            {
                maxArrVal = prices[i];
            }
            maxArr[i] = maxArrVal;
            
        }
        
        for(int i = 0 ; i < prices.length; i++)
        {
          if( maxArr[i] - prices[i] > diff)
          {
              diff = maxArr[i] - prices[i];
          }
        }
        return diff;
    }
}