public class Selection {
    public static void sorting(int arr[], int size) {

        for (int i = 0; i < size-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
           }

        for (int ele : arr) {
            System.out.print(ele+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 6, 7, 8, 2, 0 };
        sorting(arr, arr.length);
        System.out.println("helo abhishek ");
    }
}