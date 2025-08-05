import java.util.ArrayList;

public class Palindromic {
    public static ArrayList<String> palindromicMaximumSubstrings(String s) {
        ArrayList<String> result = new ArrayList<>();
        int n = s.length();
        int[] maxLen = {0}; 

        for (int i = 0; i < n; i++) {
            expandAroundCenter(s, i, i, result, maxLen);   
            expandAroundCenter(s, i, i + 1, result, maxLen); 
        }

        return result;
    }

    private static void expandAroundCenter(String s, int left, int right, ArrayList<String> result, int[] maxLen) {
        int n = s.length();
        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            int currentLen = right - left + 1;
            String palindrome = s.substring(left, right + 1);

            if (currentLen > maxLen[0]) {
                maxLen[0] = currentLen;
                result.clear();
                result.add(palindrome);
            } else if (currentLen == maxLen[0]) {
                result.add(palindrome);
            }

            left--;
            right++;
        }
    }

    public static void main(String[] args) {
        String s = "babad";
        ArrayList<String> palindromes = palindromicMaximumSubstrings(s);
        System.out.println("Palindromic substrings of \"" + s + "\": " + palindromes);
    }
}
