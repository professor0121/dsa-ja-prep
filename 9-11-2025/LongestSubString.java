public class LongestSubString {
    public static void main(String args[]) {
        String s = "kewxpw";
        s = longestSubString(s);
        System.out.println(s);
    }

    public static String longestSubString(String s) {
        char charArray[] = s.toCharArray();
        String Longest = "";
        for (int i = 0; i < charArray.length; i++) {
            String current = "";
            for (int j = i; j < charArray.length; j++) {
                char c = charArray[j];
                if (current.indexOf(c) != -1) {
                    break;
                }
                current += c;
            }
            if (current.length() >= Longest.length()) {
                Longest = current;
            }
        }
        return Longest;
    }
}