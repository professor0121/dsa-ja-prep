import java.util.*;
public class mergeSortedArray {
    public static int[] mergeSortedArray(int a[],int b[]){
        if(a.length<b.length){
            mergeSortedArray(b, a);
        }
        int j=0;
        for(int i=0; i<a.length; i++){
            if(a[i]==0){
                a[i]=b[j++];
            }
        }
        Arrays.sort(a);
        //O(nlogn)
        return a;
    }
    public static void main(String[] args) {
        System.out.println("Jai mata di");
        int a[]={3,6,9,0,0};
        int b[]={4,10};
        int result[]=mergeSortedArray(a,b);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
