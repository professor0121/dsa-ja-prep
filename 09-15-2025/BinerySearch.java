import java.util.Arrays;

public class BinerySearch {
    public static int find(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        Arrays.sort(arr);
        while (start<end) {
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=5;
        if(target==find(arr, target)){
            System.out.println(target);
        }else{
            System.out.println("Elment is not found in the givin array");
        }
    }
}
