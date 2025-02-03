package Arrays;

public class BuyAndSellOfStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
         int buyPrice = Integer.MAX_VALUE;
         int maxProfit = 0;
        for (int i = 0; i <prices.length ; i++) {
            if(buyPrice<prices[i]){
                int profit = prices[i]-buyPrice; //today's profit
                maxProfit = Math.max(maxProfit,profit); // total max profit till today

            }
            else {
                buyPrice = prices[i];
            }
        }
        System.out.println("max price of today's" + " " +  maxProfit);
    }

}
