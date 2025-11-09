public class checkAnagrams {
    public static boolean checkResult(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        StringBuilder sb1 = new StringBuilder(s1);
        String newString = sb1.reverse().toString();
        if (s2.equalsIgnoreCase(newString)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("hello abhishek");
        String s1 = "geeks";
        String s2 = "skeeg";
        boolean result = checkResult(s1, s2);
        System.out.println(result);
    }
}
