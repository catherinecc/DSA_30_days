package Hashing;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        IntersectionOfArrays intersectionOfArrays = new IntersectionOfArrays();
        int[] result = intersectionOfArrays.findIntersection(arr1, arr2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private int[] findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        for (int i : arr1) {
            set1.add(i);
        }
        for (int i : arr2) {
            if( set1.contains(i)) {
                resultSet.add(i);
            }
        }
        return resultSet.stream().mapToInt(i -> i).toArray();
    }
}
