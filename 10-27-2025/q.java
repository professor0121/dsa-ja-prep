// you have given an interverl lower, upper and a sorted array of unique
// integers ,
// all of which lie whithin this interverl a number x is considerd missing if x
// is in the range of lower and upper
// but not present in array you task is to return smalllest set of sorted range
// that incldes all missing numbers insuring
// no element from array in within any range and every missing number is coverd
// exactly one
// arr[]={14,15,20,30,31,45}
// lower=10
// upper=50
// output [[10,13],[16,19],[21,29],[32,44],[46,50]]

import java.util.ArrayList;

public class q {

    public static ArrayList<ArrayList<Integer>> findMissingElelement(int lower, int upper, int arr[]) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int prev = lower - 1;
        for (int i = 0; i <= arr.length; i++) {
            int curr = 0;
            if (i == arr.length) {
                curr = upper + 1;
            } else {
                curr = arr[i];
            }
            if (curr - prev >= 2) {
                ArrayList<Integer> sublist = new ArrayList<>();
                sublist.add(prev + 1);
                sublist.add(curr - 1);
                list.add(sublist);
            }
            prev = curr;
        }
        return list;
    }

    public static void main(String[] args) {
        int lower = 10;
        int upper = 50;
        int arr[] = { 14, 15, 20, 30, 31, 45 };
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list = findMissingElelement(lower, upper, arr);
        System.out.println(list);
    }
}