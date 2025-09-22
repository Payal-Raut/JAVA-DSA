public class BuySell {
    public static int findProfit(int prices[]){
        int max_profit = 0;
        int bestBuy = prices[0];
        for(int i = 1 ; i<prices.length;i++){
            bestBuy = Math.min(bestBuy , prices[i]);
            int res = prices[i]-bestBuy;
            max_profit = Math.max(max_profit , res);
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,8,4};
        int profit = findProfit(prices);
        System.out.println("Maximum Profit: " + profit);
    }
}
