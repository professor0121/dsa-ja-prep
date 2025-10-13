// Given an array arr[] of integers and a number x, the task is to find the smallest subarray with a sum strictly greater than x.
// Example input: x = 51
// Example input: arr = [1, 4, 45, 6, 0, 19]

public class urvi {
    public static int calculateSubArraySum(int arr[]) {
        int n = arr.length;
        int minLength = n + 1;

        for (int i = 0; i < n; i++) {
            int curr_sum = arr[i];

            if (curr_sum > 51) {
                return 1;
            }

            for (int j = i + 1; j < n; j++) {
                curr_sum += arr[j];

                if (curr_sum > 51 && (j - i + 1) < minLength) {
                    minLength = j - i + 1;
                }
            }
        }

        if (minLength == n + 1)
            return 0;
        else
            return minLength;
    }

    public static void main(String[] args) {
        System.out.println("hello from java");
        int arr[] = { 1, 4, 45, 6, 0, 19 };
        System.out.println(calculateSubArraySum(arr));
    }
}
