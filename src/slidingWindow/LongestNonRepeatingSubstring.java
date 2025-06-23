package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatingSubstring {
    public static void main(String[] args) {
        String s = "sdfkajlafsf'alsfjassmdfnkfba.s";
        String result = longestNotRepeatingSubstring(s);
        System.out.printf("Length of the longest non-repeating substring is " + result);
    }

    private static String longestNotRepeatingSubstring(String s) {
        char[] c = s.toCharArray();
        int size = c.length;
        int left = 0;
        int result = 0;
        int right = 0;
        String finalString = null;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            if (map.containsKey(c[i])) {

                // Update 'left' to skip the previous occurrence of the current character,
                // but ensure 'left' doesn’t move backward by using: left = max(left, previousIndex + 1)
                left = Math.max(map.get(c[i]) + 1, left);
                //also add the current occurance to the map
            }
            map.put(c[i], i);
            //length = r-l+1;
            int newResult = i - left + 1;
            if (newResult > result) {
                result=newResult;
                finalString = s.substring(left, i+1);
            }


        }
        return finalString;
    }
}
