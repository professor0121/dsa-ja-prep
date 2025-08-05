public class Question3 {

    public static int[] SqrNums(int []array){
        for (int i = 0; i < array.length; i++) {
            array[i]=array[i]*array[i];
        }

        for(int i=0;i<array.length;i++){
            for (int j = 0; j < array.length-1-i; j++) {
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
        System.out.println("Hello from Question3!");
        int array[]={-4,-1,0,3,10};
        array=SqrNums(array);
        for(int num:array){
            System.out.println(num);
        }
    }
}
