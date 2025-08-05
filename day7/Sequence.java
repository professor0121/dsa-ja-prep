// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
// You must write an algorithm that runs in O(n) time.

import java.util.Arrays;
import java.util.HashMap;

public class Sequence {
    public static int sequenceNum(int nums[]){
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
                int left = map.getOrDefault(num - 1, 0);
                int right = map.getOrDefault(num + 1, 0);
                int currentLength = left + right + 1;
                maxLength = Math.max(maxLength, currentLength);
                map.put(num, currentLength);
                System.out.println("Current number: " + num + ", Left length: " + left + ", Right length: " + right + ", Current sequence length: " + currentLength);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(sequenceNum(nums)); 
    }
}
