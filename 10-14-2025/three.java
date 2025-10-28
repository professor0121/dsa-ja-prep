import java.util.Arrays;

public class three {
    public static int[] sortZeros(int arr[]) {
        int newArr[] = new int[arr.length];
        int currentIndexofNewArr = 0;

        for (int currentIndex = 0; currentIndex < arr.length; currentIndex++) {
            if (arr[currentIndex] != 0) {
                newArr[currentIndexofNewArr++] = arr[currentIndex];
            }
        }

        Arrays.sort(newArr, 0, currentIndexofNewArr);

        for (int i = currentIndexofNewArr; i < arr.length; i++) {
            newArr[i] = 0;
        }

        return newArr;
    }

    public static void main(String[] args) {
        System.out.println("hello abhishek ... how are you ???");
        int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
        arr = sortZeros(arr);

        for (int element : arr) {
            System.out.println(element);
        }
    }
}
