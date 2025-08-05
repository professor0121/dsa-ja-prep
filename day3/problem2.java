// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

import java.util.ArrayList;

public class problem2 {

    public static ArrayList<Integer> findPosition(int nums[],int target){
        ArrayList<Integer> map=new ArrayList<>();
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target){
                map.add(mid);
                break;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
        
        }
        return map;
    }
    public static void main(String[] args) {
        System.out.println("hello worlds");
        int nums[]={5,7,7,8,8,10};
        int target=10;
        System.out.println(findPosition(nums, target));
    }
}



// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8 Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6 Output: [-1,-1]