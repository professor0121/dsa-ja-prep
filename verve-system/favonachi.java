public class favonachi{
    public static int nNumFav(int n){
        if(n<0)return n;
        int a=1;
        int b=1;
        int c=2;
        for(int i=2; i<n; i++){
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println("Jai mata di");
        int result=nNumFav(3);
        System.out.println(result);
    }
}