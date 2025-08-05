// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

 

// Example 1:

// Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0] Output: [0]

public class Question1{


    public static int [] Zero(int []array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                for (int j = i+1; j < array.length; j++) {
                    if(array[j] != 0){
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
    public static void main(String[] args){
        System.out.println("hello worlds");
        int array[]={0};
        array=Zero(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}