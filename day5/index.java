public class index {
    public static int returnIndex(int[] array) {
        int totalSum = 0;
        for (int num : array) {
            totalSum += num;
        }
        int leftSum = 0;

        for (int i = 0; i < array.length; i++) {
            int rightSum = totalSum - leftSum - array[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += array[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("hellow worlds");
        int array[] = { 1, 7, 3, 6, 5, 6 };
        int index= returnIndex(array);
	System.out.println(index);
    }
}
