public class longSeq {
    public static int longestSeq(int arr[]) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String args[]) {
        int arr[] = { 0, 1, 0, 1, 1, 1, 1 };
        int result = longestSeq(arr);
        System.out.println(result);
        // output:4
    }
}