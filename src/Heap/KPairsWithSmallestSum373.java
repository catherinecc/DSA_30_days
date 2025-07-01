package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KPairsWithSmallestSum373 {


    //WE follow a lazy approach of picking the smallest element from the heap
    //since the arrays are sorted, we know 0,0 is the smallest pair
    // we first push all the 0,j pairs into the heap
    // then we pop the smallest element from the heap which is always 0,0 in the first iteration
    // the next smallest could be 0,1 or 1,0 .
    // 0,1 is already in the heap. so we advance the pointer of the second array.
    // now if 0,1 is the smallest, we pop it.
    //next smallest could be 1,0 ( which is already in the heap) or 0,2
    //following this logic, basically, we need to keep the i index of min element and advance the  j
    public static void main(String[] args) {
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};
        int k = 3;
        KPairsWithSmallestSum373 kPairsWithSmallestSum373 = new KPairsWithSmallestSum373();
        List<int[]> ints = kPairsWithSmallestSum373.kSmallestPairs(nums1, nums2, k);
        for (int [] arr : ints) {
            System.out.printf("(%d, %d) ", arr[0], arr[1]);

        }

        System.out.println(ints.toString());
    }

    private List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            System.out.println("One of the arrays is empty, returning empty result.");
            return new ArrayList<>();
        }
        PriorityQueue<int[]> minheap = new PriorityQueue<>((a,b) -> nums1[a[0]]+nums2[a[1]] - (nums1[b[0]]+nums2[b[1]]));

        if(k<=0 || nums1.length==0 || nums2.length==0 || k<nums1.length) {
            return null;
        }
        if (k< nums1.length || k< nums2.length) {
            System.out.println("k is less than the length of either array, returning empty result.");
            return null;
        }
        //priorityQueue of indexes
        // member - array of size 2 , say arr- arr[0]- index in nums1, arr[1]- index in nums2
        // ordering (nums1[a[0]] + nums2[a[1]]) - (nums1[b[0]] + nums2[b[1]])
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> (nums1[a[0]]+nums2[a[1]]) - (nums1[b[0]] + nums2[b[1]]));
        // Push the first k pairs (0,j) into the minheap
        for(int j=0; j< Math.min(k,nums2.length); j++){
            minHeap.add( new int[]{0, j} ); // Pushing pairs (0, j) where j is the index in nums2
        }
        List<int[]> result = new ArrayList<>();
        //int j=0;
        while(k-->0)
        {
            int[] min = minHeap.poll();
            int i = min[0]; // index in nums1
            int j= min[1]; // index in nums2
            result.add(new int[] {nums1[i], nums2[j]});

            j++;
            if(j < nums2.length) {
                // If j is within bounds, add the next pair (i, j) to the minheap
                minheap.add(new int[]{i,j});
            }

            // the next element in the ith column already exists in the heap
            // therefore advance j and push i tinto the heap


        }


        // Visualise a 2D array with nums1 on x axis and nums2 on y axis
       return result;
    }
}
