public class one {
    public static void swapArrays(int a[], int b[]) {
        if (a.length < b.length) {
            swapArrays(b, a);
        }

        int newArray[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            a[i] = newArray[i];
        }

        for (int element : a) {
            System.out.println(element);
        }
        for (int element : b) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        System.out.println("hello from java");
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int b[] = { 6, 7, 8, 9, 0 };
        swapArrays(a, b);
    }
}