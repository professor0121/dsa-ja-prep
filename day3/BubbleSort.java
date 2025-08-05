public class BubbleSort {
   
    public static int[] sort(int nums[]){
        int size=nums.length;
        int array[]=new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=nums[i];
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-1-i; j++) {
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int array[]={9,8,7,6,5,4,3,2,1};
        array=sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
