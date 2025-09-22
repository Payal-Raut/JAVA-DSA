public class BestBuySellTime {
    public static int findBestTime(int arr[]){
        int buyPrice=arr[0];
        int Profit = 0 ;
        for(int i = 1 ; i<arr.length ; i++){
            buyPrice = Math.min(buyPrice , arr[i]);
            if(arr[i] > buyPrice){
                Profit = Math.max(Profit, arr[i]-buyPrice);
            }
        }
        return Profit;

    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,9,4};
        int MaxProfit = findBestTime(arr);
        System.out.println("Profit is " + MaxProfit);


    }
}
