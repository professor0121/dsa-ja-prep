public class minimunPlateform{
    public static int calcMinPlateform(int arr[], int dep[]){
        if(arr.length==0 || dep.length==0 || arr.length!=dep.length)return 0;
        int n=arr.length;
        int platform=1;
        for(int i=2; i<n; i++){
           if(arr[i]<dep[i-1]){
            platform++;
           }
        }
        return platform;
    }
    public static void main(String[] args) {
        System.out.println("Jai mata di");
        int arr[]={900,940,950,1221};
        int dep[]={910,1200,1120,4520};
        int result=calcMinPlateform(arr, dep);
        System.out.println(result);
    }
}