package slidingWindow;
/*
Given a binary array nums and an integer k,
return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

Think of it as:
Longest array with max k 0s
* */
public class ConsecutiveOnesIII {
    // Window with max k zeros
// Expand and track max while zeros ≤ k
// If zeros > k, move left past first zero
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,1,1,1,0,1,1,1,1};
        int k = 2;
        int n =findMaxConsecutiveOnes(arr,k);
        System.out.println(n);
    }

    private static int findMaxConsecutiveOnes(int[] arr, int k) {
        int maxlength=0;
        int zeros=0;
        int left=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==0)
            {
                zeros++;
            }
           while(zeros>k){
               if(arr[left]==0) zeros--;
               left++;
           }
           maxlength = Math.max(maxlength, i-left+1);

        }

        return maxlength;


    }


}
