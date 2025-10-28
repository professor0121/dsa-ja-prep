public class sumOfDigit {

    public static int sum(int num) {
        int sumOfDigits = 0;

        while (num > 0 || sumOfDigits > 9) {
            if (num == 0) {
                num = sumOfDigits;
                sumOfDigits = 0;
            }
            sumOfDigits += num % 10;
            num /= 10;
        }
        return sumOfDigits;
    }

    public static void main(String[] args) {
        System.out.println("hello");
        int num = sum(897);
        System.out.println(num);
    }
}
