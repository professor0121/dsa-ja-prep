
public class prime {
    public static int printAllPrimeNumber(int low, int heigh) {
        int count = 0;
        for (int i = low; i <= heigh; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                ++count;
            }
        }
        System.out.println("");
        return count;
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int low = 1;
        int heigh = 1000;
        int count = printAllPrimeNumber(low, heigh);
        System.out.println("total count for " + low + " to " + heigh + " is : " + count);
        System.out.println(Math.sqrt(6));
    }
}
