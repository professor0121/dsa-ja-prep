public class formTrangle {
    public static boolean isTrangle(int arr[],int n){
        if(n==0)return false;
        for(int i=2; i<n; i++){
            if(arr[i]<arr[i-1]+arr[i-2]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        boolean result=isTrangle(arr, arr.length);
        System.out.println(result);
        System.out.println("Jai mata di");
    }
}
