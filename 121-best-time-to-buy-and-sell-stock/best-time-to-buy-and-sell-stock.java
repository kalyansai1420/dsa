class Solution {
    public int maxProfit(int[] prices) {
         int minPrice = Integer.MAX_VALUE;
         int maxProfit = Integer.MIN_VALUE;
         for(int i=0;i<prices.length;i++){
            int price = prices[i];
            minPrice = Math.min(price,minPrice);
            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit,profit);
         }
         return maxProfit;
         
    }
}