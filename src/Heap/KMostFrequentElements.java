package Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
// Step 1: Build a HashMap to store <element, frequency>
// Step 2: Use a Min Heap (PriorityQueue) to keep the top k frequent elements
//         - Push each entry from the map into the heap
//         - If heap size exceeds k, remove the element with the lowest frequency
// Step 3: After processing, the heap will contain the k most frequent elements
 */
public class KMostFrequentElements {
    int[] nums = {1,2,3,4,2,3,4,4,4,5,5,6,6,6,6,7,7,8,8,9,9,9};
    int k = 2;
    public static void main(String[] args) {
        KMostFrequentElements kMostFrequentElements = new KMostFrequentElements();
        kMostFrequentElements.findKMostFrequent();
    }

    private void findKMostFrequent() {
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(int i : nums) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }
        //After building the frequency map, we need to find the keys which have the highest frequency.
        //We can use a min-heap to keep track of the top k frequent elements.

        PriorityQueue<Integer> q = new PriorityQueue<>( (n1,n2) -> frequencyMap.get(n1) - frequencyMap.get(n2) );
        for(int i : frequencyMap.keySet()) {
            q.add(i);
            if (q.size() > k) {
                q.poll(); // Remove the element with the lowest frequency
            }
        }
        //now we need to print the elements in the heap
       q.stream().forEach(System.out::println);

        }
    }


