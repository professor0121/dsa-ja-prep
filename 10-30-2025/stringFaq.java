import java.util.*;

public class stringFaq {

    public static boolean checkStringFaq(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char charArrays1[] = s1.toCharArray();
        char charArrays2[] = s2.toCharArray();
        Arrays.sort(charArrays1);
        Arrays.sort(charArrays2);
        for (int i = 0; i < s1.length(); i++) {
            if (charArrays1[i] != charArrays2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "hello abhishek";
        System.out.println(str);

        String s1 = "geeks";
        String s2 = "skeeg";

        boolean result = checkStringFaq(s1, s2);
        System.out.println(result);
    }
}
