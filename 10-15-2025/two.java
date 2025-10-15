public class two {
    public static void swapStrings(String a, String b) {
        String temp = "";
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        System.out.println("hello from java");
        String a = "hello";
        String b = "world";
        swapStrings(a, b);
    }
}
