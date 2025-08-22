import java.util.Arrays;

public class Question1 {

    public static void rearrange(int arr[]) {
        int n = arr.length;

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Choose a max element greater than all
        int maxElem = arr[n - 1] + 1;
        System.out.println(maxElem);
        int minIndex = 0, maxIndex = n - 1;
        System.out.println(minIndex+""+maxIndex);
        // Step 3: Modify array in place
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Place max element at even index
                arr[i] += (arr[maxIndex] % maxElem) * maxElem;
                maxIndex--;
            } else {
                // Place min element at odd index
                arr[i] += (arr[minIndex] % maxElem) * maxElem;
                minIndex++;
            }
        }

        // Step 4: Decode new values
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / maxElem;
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        rearrange(arr1);
        System.out.println("Output 1: " + Arrays.toString(arr1));

        int arr2[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        rearrange(arr2);
        System.out.println("Output 2: " + Arrays.toString(arr2));

        int arr3[] = {1};
        rearrange(arr3);
        System.out.println("Output 3: " + Arrays.toString(arr3));
    }
}
