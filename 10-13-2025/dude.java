// geven two array return the common lement from the both arrays

import java.util.ArrayList;

public class dude {
    public static ArrayList<Integer> commonElement(int a[],int b[]){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i]==b[j]){
                    list.add(a[i]);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println("hello words");
        int a[]={5,6,2,1,4};
        int b[]={7,9,4,2};
        System.out.println(commonElement(a, b));
    }
}
