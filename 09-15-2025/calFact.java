public class calFact {
    public static int fact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * fact(num - 1);
    }

    public static void main(String[] args) {
        int num = 4;
        int result = fact(num);
        System.out.println(result);
    }
}
