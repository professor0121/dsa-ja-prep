public class maxSubArraySum{
    public static int calcSum(int arr[]){
        if(arr.length==0)return 0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            int currentSum=0;
            for(int j=i;j<arr.length;j++){
                currentSum+=arr[j];
                maxSum=Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        System.out.println("Jai mata di");
        int arr[]={34,-50,42,14,-5,86};
        int result=calcSum(arr);
        System.out.println(result);
    }
}