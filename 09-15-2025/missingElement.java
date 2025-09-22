import java.util.ArrayList;

public class missingElement {

    public static ArrayList<Integer> missing(int arr[]){
        ArrayList<Integer> map=new ArrayList<>();
        for(int i=0; i<arr.length-1 ;i++){
            if((arr[i]+1)!=(arr[i+1])){
                map.add(arr[i]+1);
            }
        }
        return map;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,8,9,11};
        ArrayList<Integer> result=new ArrayList<>();
        result=missing(arr);
        System.out.println(result);
    }
}
