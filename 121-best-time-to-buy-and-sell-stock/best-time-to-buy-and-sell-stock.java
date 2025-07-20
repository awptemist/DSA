class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyDay = prices[0];

        for(int i=1; i<prices.length; i++){

            if(prices[i] > buyDay){
                maxProfit = Math.max(maxProfit,prices[i] - buyDay);
            }
            buyDay = Math.min(buyDay,prices[i]);
        }

        return (maxProfit > 0) ? maxProfit : 0;
    }
}