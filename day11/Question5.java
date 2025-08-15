import java.util.Arrays;

public class Question5 {
    public void mergeArrays(int a[], int b[]) {
        for(int i=0; i<b.length;i++){
            for(int j=0; j<a.length;j++){
                if(a[j]>b[i]){
                    int temp=a[j];
                    a[j]=b[i];
                    b[i]=temp;
                }
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int ele:a){
            System.out.println(ele);
        }
        for(int ele:b){
            System.out.println(ele);
        }
    }
    public static void main(String []args){
        int a[]={1, 5, 9, 10, 15, 20};
        int b[]={2, 3, 8, 13};
        Question5 obj=new Question5();
        obj.mergeArrays(a, b);
        System.out.println("hello abhishek");
    }
}
  

