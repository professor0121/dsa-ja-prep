import java.util.Arrays;
import java.util.Scanner;

public class q2 {

    public static int calculateProduct(Integer arr[], int type) {
        Arrays.sort(arr);
        if (type > arr.length) {
            return 0;
        }
        int maxProduct = 1;
        for (int i = arr.length - 1; i >= arr.length - type; i--) {
            maxProduct *= arr[i];
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        System.out.println("enter your type\n");
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        System.out.println("size of the array");
        int size = sc.nextInt();
        Integer arr[] = new Integer[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int maxProduct = calculateProduct(arr, type);
        System.out.println(maxProduct);
    }

}

// given an interger arraay find a maximum product of a triplate in the array
// arr={10,3,5,6,20}
// outpurt =1200