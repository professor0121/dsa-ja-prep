public class mergSort{
    public static void mergeSort(int arr[], int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
        
    }

    public static void merge(int arr[] ,int start, int mid, int end ){
        System.out.println(start+""+""+mid+""+""+end);
        int temp[] = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=end){
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(int p=0;p<temp.length;p++){
            arr[start+p] = temp[p];
        }        
    }


    public static void main(String [] args){
        System.out.println("he  ");
        int arr[]={9,8,7,6,5,4,3,2,1,0};
        mergeSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");  
        }

    }
}