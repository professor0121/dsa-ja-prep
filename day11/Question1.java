import java.util.*;

public class Question1{
    public ArrayList<Integer> sumOfContineousSubArray(int arr[], int target){
        ArrayList<Integer> list=new ArrayList<Integer>();
        int size=arr.length;
        for(int i=0; i<size; i++){
            int sum=0;
            for(int j=i; j<size; j++){
                sum+=arr[j];
                if(sum==target){
                    list.add(i+1);
                    list.add(j+1);
                    return list;
                }
            }
        }
        list.add(-1);
        return list;
    }
    public static void main(String [] args){
        int arr[]={5, 3, 4};
        int target=2;
        Question1 obj=new Question1();
        ArrayList<Integer> list=new ArrayList<>();
        list=obj.sumOfContineousSubArray(arr,target);
        System.out.println("hello abhishek good morning  "+list);
    }
}