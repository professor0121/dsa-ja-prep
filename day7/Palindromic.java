import java.util.ArrayList;
public class Palindromic {
    public static ArrayList<String> palindromicMaximumSubstrings(String s) {
        ArrayList<String> result = new ArrayList<>();
        int n = s.length();
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            int left = i, right = i;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    result.clear();
                    result.add(s.substring(left, right + 1));
                } else if (right - left + 1 == maxLength) {
                    result.add(s.substring(left, right + 1));
                }
                left--;
                right++;
            }

            left = i;
            right = i + 1;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    result.clear();
                    result.add(s.substring(left, right + 1));
                } else if (right - left + 1 == maxLength) {
                    result.add(s.substring(left, right + 1));
                }
                left--;
                right++;
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        String s = "babad";
        ArrayList<String> palindromes = palindromicMaximumSubstrings(s);
        System.out.println("Palindromic substrings of \"" + s + "\": " + palindromes);
    }
}
