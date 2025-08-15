import java.util.*;

public class Question2 {
    public int countTriplets(int arr[]) {
        Arrays.sort(arr); 
        int size = arr.length;
        int count = 0;

        for (int i = size - 1; i >= 0; i--) {
            int target = arr[i];
            int left = 0;
            int right = i - 1; 

            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == target) {
                    count++;
                    left++;
                    right--; 
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Question2 obj = new Question2();
        int arr[] = {1, 5, 3, 2};
        int result = obj.countTriplets(arr);
        System.out.println("Count of triplets: " + result); // Expected: 2
    }
}


// Using two pointer approaches we can done it in this Queestion 
//in O(N) time complexty to solve this triplate question