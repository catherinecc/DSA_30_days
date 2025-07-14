package IBM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 4, 6, 3, 4, 8, 8, 9, 9, 9, 10, 10, 10, 10};
         // Reverse the array
        Arrays.stream(arr)
                .distinct() // Remove duplicates
                .limit(3) // Limit to first 3 distinct elements
                .forEach(System.out::println); // Print each element
        //IntStream - stream of primitive int values

        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 1, 2, 1, 4, 6, 3, 4, 8, 8, 9, 9, 9, 10, 10, 10, 10));
        System.out.println("Reversed List: " + integers);
        Collections.reverse(integers);
        List<Integer> collect = integers.stream().distinct().limit(3).collect(Collectors.toList());
        System.out.println("Distinct and limited to 3: " + collect);


    }
}
