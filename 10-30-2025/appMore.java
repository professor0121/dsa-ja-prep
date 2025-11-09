import java.util.HashMap;

public class appMore {
    public static int calc(int arr[]) {
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.containsKey(arr[i])) {
                list.put(arr[i], list.get(arr[i]) + 1);
            } else {
                list.put(arr[i], 1);
            }
        }
        int temp = arr.length / 2;
        System.out.println(list);
        for (Integer key : list.keySet()) {
            if (list.get(key) >= temp) {
                return key;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 2, 3, 5 };
        int result = calc(arr);
        System.err.println(result);
    }
}
