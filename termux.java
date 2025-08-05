import java.util.ArrayList;

public class termux {
    public static ArrayList<Integer> revert (int array[],int tartget){
        ArrayList list=new ArrayList<>();
        int start=0;
        int end=array.length-1;
        while (start<end) {
            int mid=(start+end)/2;
            if(array[mid]==tartget){
                list.add(array[mid]);
            }
            else if(array[mid]<tartget){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList list=new ArrayList<>();
        int array[]={3,4,4,5,6,7,7,7,7,7,7,8,9};
        int tartget=7;
        list=revert(array,tartget);
    }
}
