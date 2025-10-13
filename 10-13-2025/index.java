// Question : 1 given an array of integrers arr and integer target find the pair of element from the array such that the sum of the pair is closest to the target
//return the pair in sorted order
//example arr[10,30,20,5] and target is 25 the pair is [5,20]
//example arr[10,30,20,5] and target is 9 the pair is [5,10]

import java.util.ArrayList;
import java.util.Arrays;

public class index {
    
    public static ArrayList<Integer> findClosestPair(int[] arr, int target) {
        Arrays.sort(arr); 

        int left = 0;
        int right = arr.length - 1;
        int closestSum = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;

        int a = 0, b = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];
            int diff = Math.abs(sum - target);

            if (diff < minDiff) {
                minDiff = diff;
                closestSum = sum;
                a = arr[left];
                b = arr[right];
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(a);
        result.add(b);
        return result;
    }
    public static void main(String[] args) {
        IO.println("Hello, World!");
        int arr[] = { 10, 30, 20, 5 };
        System.out.println(findClosestPair(arr, 20));
    }
}



