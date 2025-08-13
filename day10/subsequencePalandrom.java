
// package day10;
import java.util.*;

public class subsequencePalandrom {
    public static Set<String> setMap = new HashSet<>();

    public static int subsequencePalandromString(String str) {
        // System.out.println(str);

        int stringLength = str.length();

        for (int i = 0; i < (1 << stringLength); i++) {
            StringBuilder subSet = new StringBuilder();
            for (int j = 0; j < stringLength; j++) {
                if ((i & (1 << j)) != 0) { // check if j-th bit is set
                    subSet.append(str.charAt(j));
                }
            }
            setMap.add(subSet.toString()); // add full subset
        }

        // System.out.println(setMap);
        return 0;
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "bbabcbcab";
        int length = subsequencePalandromString(str);
        setMap.removeIf(s -> !isPalindrome(s));
        // System.out.println("hellw abhi");
        String maxPalindrome = "";
        for (String s : setMap) {
            if (s.length() > maxPalindrome.length()) {
                maxPalindrome = s;
            }
        }
        System.out.println(maxPalindrome.length());
    }
}
