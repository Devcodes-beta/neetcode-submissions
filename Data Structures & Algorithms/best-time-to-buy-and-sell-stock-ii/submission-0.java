class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=0,sell=0;
        for(int i=0;i<prices.length;i++)
        {
            //dont buy
            while(i<prices.length-1 && prices[i]>=prices[i+1])
            {
                i++;
            }
            //if last index and no buying
            if(i==prices.length-1)
            break;            
            //buy
            buy=prices[i];
            //sell
            while(i<prices.length-1 &&  prices[i]<=prices[i+1])
            {
                i++;
            }
            sell=prices[i];
            profit+=sell-buy;

        }
        return profit;
        
    }
}