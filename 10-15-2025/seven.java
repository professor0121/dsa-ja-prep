import java.util.Arrays;

public class seven {
    public static void main(String[] args) {
        System.out.println("hello from the java");
        String s = "fkjdfiebvodervdd";
        char sCharArray[] = s.toCharArray();
        Arrays.sort(sCharArray);
        String se = new String(sCharArray);
        System.out.println(se);
    }
}
