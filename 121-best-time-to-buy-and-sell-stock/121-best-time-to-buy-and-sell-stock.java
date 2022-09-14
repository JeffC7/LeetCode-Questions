class Solution {
    public int maxProfit(int[] prices) {
        int winStart = 0;
        int maxProfit = 0;
        int currentProfit = 0;
        
        for (int winEnd = 0; winEnd < prices.length; winEnd++) {
            while (prices[winEnd] < prices[winStart]) {
                winStart++;
            }
            
            if (prices[winStart] < prices[winEnd])
                currentProfit = prices[winEnd] - prices[winStart];
            
            maxProfit = Math.max(maxProfit, currentProfit);
            System.out.println(maxProfit);
        }
        return maxProfit;
    }
}