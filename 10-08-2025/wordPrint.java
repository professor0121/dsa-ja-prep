import java.util.ArrayList;
import java.util.Collections;

public class wordPrint {
    public static String num(int number) {
        String nn = "";
        ArrayList<String> list = new ArrayList<>();
        String arr[] = {
                "zero",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine"
        };
        while (number != 0) {
            int rem;
            rem = number % 10;
            number = number / 10;
            list.add(arr[rem]);
        }
        Collections.reverse(list);
        nn = list.toString();
        return nn;
    }

    public static void main(String[] args) {
        String sc = num(567);
        System.out.println(sc);
    }
}
