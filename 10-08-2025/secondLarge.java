import java.util.Arrays;

public class secondLarge {
    public static int num(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public static void main(String[] args) {
        System.out.println("hello");
        int arr[] = { 2, 3, 4, 5, 6, 7, 8 };
        int result = num(arr);
        System.out.println(result);
    }
}
