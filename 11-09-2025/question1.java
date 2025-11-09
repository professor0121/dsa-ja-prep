public class question1 {
    public int[] rotateWithIndex(int arr[], int index) {
        if (index == 0 || index >= arr.length) {
            return arr;
        }
        int newArray[] = new int[arr.length];
        int pointer = 0;
        for (int i = index; i < newArray.length; i++) {
            newArray[pointer++] = arr[i];
        }
        for (int i = 0; i < index; i++) {
            newArray[pointer++] = arr[i];
        }
        return newArray;
    }

    public static void main(String rgs[]) {
        System.out.println("hello this is from java");
        int arr[] = { 0, 1, 2, 4, 5, 6, 7 };
        int index = 1;
        question1 obj = new question1();
        arr = obj.rotateWithIndex(arr, index);
        for (int element : arr) {
            System.out.println(element);
        }
    }
}

// { 0 1 2 4 5 6 7 }
//