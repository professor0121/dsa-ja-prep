
import java.util.ArrayList;

public class two {
    public static int checkNum(int arr[], int ele) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int element : arr) {
            if (element != ele) {
                list.add(element);
            }
        }
        return list.size();
    }

    public static void main(String[] args) {
        System.out.println("hello this log is came from java");
        int arr[] = { 0, 1, 3, 0, 2, 2, 4, 2 };
        int result = checkNum(arr, 2);
        System.out.println(result);
    }
}
