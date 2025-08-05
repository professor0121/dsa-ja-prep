// We are playing the Guess Game. The game is as follows:

// I pick a number from 1 to n. You have to guess which number I picked.

// Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

// You call a pre-defined API int guess(int num), which returns three possible results:

// -1: Your guess is higher than the number I picked (i.e. num > pick).1: Your guess is lower than the number I picked (i.e. num < pick).0: your guess is equal to the number I picked (i.e. num == pick).
// Return the number that I picked.

import java.util.*;

public class problem4 {

    // chalo jaise user ne 6 pick kiya
    public static int guess(int target, int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;
        while (start < end) {
            mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hello worlds");
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int target;
        int randomNumber = (int) (Math.random() * (array.length + 1));
        System.out.println("Enter your target Number");
        target = sc.nextInt();
        int index = guess(target, array);

        if (randomNumber < array[index]) {
            System.out.println("your guessed number is less then the number the actuall number is \t" + target
                    + "\tand you gussed\t" + randomNumber);
        } else if (randomNumber == array[index]) {
            System.out.println("you gussed correct");
        } else {
            System.out.println("You gussed number is higher then the numberthe actuall number is \t" + target
                    + "\tand you gussed\t" + randomNumber);
        }
    }
}

// Example 1:

// Input: n = 10, pick = 6 Output: 6
// Example 2:

// Input: n = 1, pick = 1 Output: 1
// Example 3:

// Input: n = 2, pick = 1 Output: 1

// Constraints:

// 1 <= n <= 231 - 11 <= pick <= n