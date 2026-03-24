public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] arr) {
        int buy = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < buy) {
                buy = arr[i];
            } else {
                maxProfit = Math.max(maxProfit, arr[i] - buy);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        int profit = maxProfit(arr);
        System.out.println("Profit = " + profit);
    }
}
