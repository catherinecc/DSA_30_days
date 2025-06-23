package slidingWindow;

import java.util.Scanner;

/*
There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.

In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.

Problem Stmt breakdown:

You can have the following cases :

k from left end
k from right end
i from left and k-i

{ 1,2,3,4,5} k = 2 , res = 9


{ 5, 0 , 1 , 2, 1 } k=2 , res = 6

 res =

*/
public class MaxCardPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // kooduthal nannai poyo sir
        System.out.println("""
                Hello Welcome
                Please enter the Size of your array
                """
        );
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Thanks. Please enter your array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
    System.out.println("Enter the size of selection");
        int k = in.nextInt();
      System.out.printf("Max sum of %d elements is %d",k , calculateMaxPoints(arr,k));
    }

    private static int calculateMaxPoints(int[] arr , int k) {
        //sliding window
        // initialise maxsum to sum of left k elements
        // shrink left window , grow right window , take Max

        int maxsum =0;

        for (int i = 0; i <k ; i++) {
        maxsum += arr[i];
        }
        int left = k-1;
        int right = arr.length-1;
        int sum = maxsum;

        for(int i=0; i<k; i++)
        {
            //shrink left, expand right
            sum-=arr[left--];
            sum+=arr[right--];
            maxsum = Math.max(sum,maxsum);
        }
        return maxsum;

    }
}
