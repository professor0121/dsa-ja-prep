import java.util.*;

public class Question4 {
    public int missingElement(int arr[]) {
        Arrays.sort(arr);
        int start =1;
      
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
            if(start==arr[i]){
                start++;
            }else{
                return start;
            }
        }
        return arr[arr.length-1];
    }

    public static void main(String args[]) {
        Question4 obj = new Question4();
        int arr[] = {1};
        int element = obj.missingElement(arr);
        System.out.println("Hello abhishek"+element);
    }
}
