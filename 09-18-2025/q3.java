import java.util.Stack;

public class q3 {

        public static String removeAdjacent(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); 
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "abccbccba";
        System.out.println(removeAdjacent(s));
        System.out.println("Jai Shree Ram ");
    }
}
