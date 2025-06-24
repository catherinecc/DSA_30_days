package Hashing;

import java.util.*;

public class GroupAnagrams {
    /*
    Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]


    * */

    public static void main(String[] args) {
        //count array - anagrams have the same count array
        //build string from count array - add it to map < CountArrayString , List<actualStrings>>
        String[] strArr = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(anagrams(strArr));
    }

    private static Collection<List<String>> anagrams(String[] strArr) {
        Map<String, List<String>> map = new HashMap<>();
        for( String s : strArr)
        {
           char[] arr = s.toCharArray();
           int[] count = new int[26];
            for (char c : arr) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i : count)
            {
                //// why delimiter e
                // g:  if count[a] = 1, and count[b]=12, without delimiter, string = 112, with delimier 1$12
                // if count[a]=11 and count[b] = 2, string =112 , with delimiter 11$2
                sb.append("$");
                sb.append(i);
            }
            String string = sb.toString();
            List<String> list = map.getOrDefault(string, new ArrayList<>());
            list.add(s);
            map.put(string,list);


        }
        return map.values();
    }
}

