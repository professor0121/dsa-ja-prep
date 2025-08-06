import java.util.*;

public class BinarySearch {
    static int[] array;
    static int size;
    static Scanner scanner = new Scanner(System.in);

    public static boolean elementIndex(int target) {
        int low=0;
        int high=size-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(array[mid]==target) return true;
            else if(array[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        size = scanner.nextInt();
        array = new int[size];
        System.out.println("Enter the Elements of array :\n");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Enter the target element");
        int target =scanner.nextInt();
        boolean isFound=elementIndex(target);
        if(isFound){
            System.out.println("Element is found");
            return;
        }
        else{
            System.out.println("Element is not found ");
            return;
        }
    }
}