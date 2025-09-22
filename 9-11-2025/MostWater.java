// public class MostWater {
//     public static int maxWater(int height[]) {
//        int maxWater = 0;

//         for (int i = 0; i < height.length; i++) {
//             for (int j = i + 1; j < height.length; j++) {
//                 int distance = j - i; 
//                 int minHeight = Math.min(height[i], height[j]); 
//                 int currentWater = minHeight * distance;

//                 if (currentWater > maxWater) {
//                     maxWater = currentWater;
//                 }
//             }
//         }

//         return maxWater;
//     }

//     public static void main(String[] args) {
//         int height[] = { 8,7,2,1 };
//         // int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
//         int maxWater=maxWater(height);
//         System.out.println(maxWater);
//     }
// }


public class MostWater {
    public static int maxWater(int height[]) {
        int maxWater = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            int distance = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int currentWater = minHeight * distance;

            maxWater = Math.max(maxWater, currentWater);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int height[] = { 8, 7, 2, 1 };
        // int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int maxWater = maxWater(height);
        System.out.println(maxWater);
    }
}
