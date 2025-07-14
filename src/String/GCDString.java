package String;
/*“If both strings are made by repeating the same base pattern, th
en their concatenation in any order will be equal — and that’s the key to identifying the GCD string.”

GCD string length - euclidean algorithm

*/
public class GCDString {
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        GCDString gcdString = new GCDString();
        String result = gcdString.gcdOfStrings(str1, str2);
        System.out.println("GCD of strings: " + result);
    }

    private String gcdOfStrings(String str1, String str2) {
        if(!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }
        return str1.substring(0, gcdLength(str1.length(), str2.length()));
    }

    private int gcdLength(int length, int length1) {
        if(length1==0){
            return length;
        } else {
            return gcdLength(length1, length % length1);
        }

    }

   /* private String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }
        if (str2.isEmpty()) {
            return str1;
        }
        if (!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }
        return gcdOfStrings(str1.substring(str2.length()), str2);
    }*/


}
