public class index {
public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0; 
        int j = 0; 
        int k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }
    public static void main(String[] args) {
       int arr1[]={};
       int arr2[]={1};
       int result[]=mergeArrays(arr1, arr2);
       int newArrayLength=result.length;
       if(newArrayLength%2==0){
        // float r1=result[newArrayLength/2]+result[result/2-1]
        // System.out.println(r1);
       }
       else{
        float r1=result[newArrayLength/2];
        System.out.println(r1);
       }
       int sum=0;
       for(int ele:result){
        sum+=ele;
       }

       float newResult=sum/result.length;
       System.out.println(newResult);
    }
}
