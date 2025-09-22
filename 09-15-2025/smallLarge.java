import java.util.ArrayList;
import java.util.Arrays;

public class smallLarge {
    public static ArrayList<Integer> sl(int arr[]){
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(arr);
        list.add(arr[0]);
        list.add(arr[arr.length-1]);
        return list;
    }
    public static void main(String args[]){
        ArrayList<Integer> result=new ArrayList<>();
        int arr[]={2,4,6,4,1,8,0};
        result=sl(arr);
        System.out.println(result);
    }
}
