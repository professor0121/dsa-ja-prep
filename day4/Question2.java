// Given two integer arrays nums1 and nums2, return an array of their intersection. 
// Each element in the result must be unique and you may return the result in any order.
// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2] Output: [2]

import java.util.ArrayList;
import java.util.HashSet;

public class Question2 {
    public static ArrayList<Integer> uniqueArray(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        return new ArrayList<>(resultSet);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        ArrayList<Integer> result = uniqueArray(nums1, nums2);

        for (int num : result) {
            System.out.println(num);
        }
    }
}
