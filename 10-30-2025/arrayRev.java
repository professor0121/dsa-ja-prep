import java.util.Arrays;
import java.util.Collections;

public class arrayRev {

    public static Integer[] revG(Integer arr[], int k) {

        if (arr.length < k) {
            Arrays.sort(arr, Collections.reverseOrder());
            return arr;
        }
        Integer result[] = new Integer[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        Arrays.sort(result, Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            arr[i] = result[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int k = 5;
        arr = revG(arr, k);
        for (int ele : arr) {
            System.out.println(ele);
        }
    }
}
