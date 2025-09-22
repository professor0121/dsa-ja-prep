import java.util.*;

public class LongestStr {
    public static String LongestString(String s) {
        ArrayList<String> list = new ArrayList<>();
        if (s.length() == 0) {
            return null;
        }
        char charArray[] = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);

        }
        return "j";
    }

    public static void main(String args[]) {
        String s = "urvashipatel";
        s = "kewxpw";
        LongestString(s);
    }
}
