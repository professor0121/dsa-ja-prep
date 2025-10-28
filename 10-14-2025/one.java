import java.util.HashSet;

public class one {
    public static HashSet<Integer> chechNumber(int arr[]) {
        HashSet<Integer> list = new HashSet<>();
        for (int element : arr) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println("hello from java");
        HashSet<Integer> list = new HashSet<>();
        int arr[] = { 1, 3, 3, 6, 2, 2, 2, 2, 2 };
        list = chechNumber(arr);
        System.out.println(list);

    }
}