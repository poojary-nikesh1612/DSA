package Array.ArrayMedium;

public class StockBuySell {

    public static int maxProfit(int[] prices) {
        int profit=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            profit=Math.max(profit,prices[i]-min);
            min=Math.min(min,prices[i]);

        }
        return profit;
    }

    public static void main(String[]args){
        int[]arr={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
