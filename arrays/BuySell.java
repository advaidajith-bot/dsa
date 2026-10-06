public class BuySell {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice){
                minPrice = prices[i];
            } else if (prices[i]-minPrice > maxProfit) {
                maxProfit = prices[i]-minPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
    BuySell b = new BuySell();
    System.out.println(b.maxProfit(new int[]{7, 1, 5, 3, 6, 4})); 
    System.out.println(b.maxProfit(new int[]{7, 6, 4, 3, 1}));    
    System.out.println(b.maxProfit(new int[]{2, 4, 1}));         
}
}
