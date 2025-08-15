public class Question3 {
    public int maxSubarraySum(int arr[]){
        int res=arr[0];
        int maxEnding=arr[0];
        for(int i=1; i<arr.length;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(maxEnding, res);
        }
        return res;
    }
    public static void main(String[] args){
        Question3 obj=new Question3();
        int arr[]={1 ,2, 3 ,-2 ,5};
        int result=obj.maxSubarraySum(arr);
        System.out.println("max sum of subArray is :"+result);
    }
}


//Using kadens alorithem we can find the maxSubarraySum in O(n)
//and O(1) memory......