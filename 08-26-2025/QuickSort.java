public class QuickSort{
    public static int partition(int arr[],int start, int end){
        int idx=start-1;
        int pivot=arr[end];
        for(int j=start; j<end; j++){
            if(arr[j]<=pivot){
                idx++;
                int temp=arr[j];
                arr[j]=arr[idx];
                arr[idx]=temp;
            }
        }
        idx++;
        int temp=arr[end];
        arr[end]=arr[idx];
        arr[idx]=temp;
        return idx;
    }
    public static void quickSort(int arr[],int start,int end){
        if(start<end){
            int pivotIdx=partition(arr,start,end);
            quickSort(arr, start, pivotIdx-1);
            quickSort(arr, pivotIdx+1, end);
        }
    }
    public static void main(String args[]){
        int arr[]={3,6,2,8,1,0};
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}