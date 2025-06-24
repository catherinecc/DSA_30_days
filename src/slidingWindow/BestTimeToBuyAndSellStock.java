package slidingWindow;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {1,3,0,6,23};
        int n = maxProfit(arr);
        System.out.println("Maximum Profit is"+ n);
    }

    private static int maxProfit(int[] arr) {
        //left= lowest price till now
        // profit = right - left

        int left =0;
        int maxprofit = 0;
        for(int i=1;i < arr.length;i++){
            if(arr[i]<arr[left]){
                left=i;
            }
            maxprofit = Math.max(maxprofit, arr[i]-arr[left]);
            //System.out.println(maxprofit);
        }
        return maxprofit;
    }
}
