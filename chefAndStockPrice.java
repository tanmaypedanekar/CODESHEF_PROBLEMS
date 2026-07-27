class chefAndStockPrice {
    public static void main(String[] args) {
        int[] prices = Array_Utility.arrayinput();
        int ans = findMaxProfit(prices);
        System.out.println("Your max profit is :" + ans);
    }

    public static int findMaxProfit(int[] prices) {
        // write code here...
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        int num = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == min) {
                num = i;
            }
        }
        int ans = 0;
        int max = min;
        for (int i = num; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
            }
        }
        ans = max - min;
        return ans;
    }
}