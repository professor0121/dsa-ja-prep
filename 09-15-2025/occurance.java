import java.util.HashMap;

public class occurance{
    public static HashMap<Integer,Integer> calcOccure(int arr[]){
        HashMap<Integer,Integer> arrayMap=new HashMap<>();
        for(int i=0; i<arr.length; i++){
            arrayMap.putIfAbsent(arr[i], 0);
            arrayMap.put(arr[i],arrayMap.get(arr[i])+1);
        }
        System.out.println(arrayMap);
        return arrayMap;
    }
    public static void main(String args[]){
        int arr[]={2,5,7,8,10,10,13,13};
        HashMap<Integer,Integer> result=new HashMap<>();
        result=calcOccure(arr);
    }
}