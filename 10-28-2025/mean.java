public class mean {
    public static double calcAvrage(int arr[], int ind, int sum) {
        if (ind == arr.length) {
            return (double) sum / arr.length;
        }
        sum += arr[ind];
        return calcAvrage(arr, ind + 1, sum);
    }

    public static void main(String[] args) {
        System.out.println("hello abhishek");
        int arr[] = { 1, 2, 3, 4, 5 };
        double result = calcAvrage(arr, 0, 0);
        System.out.println(result);
    }
}
