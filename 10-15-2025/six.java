import java.util.HashSet;

public class six {
    public static void main(String[] args) {
        String s = "asdsfhgtyruvfghdd";
        char sCharArray[] = s.toCharArray();
        HashSet<Character> list = new HashSet<>();
        for (int i = 0; i < sCharArray.length; i++) {
            list.add(sCharArray[i]);
        }
        int size = list.size();
        System.out.println(size);
    }
}
