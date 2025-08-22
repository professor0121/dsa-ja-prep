class CountInversion {
    static int inversionCount(int arr[]) {
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length;j++){
                if((i<j)&&(arr[i]>arr[j])){
                    count++;
                }
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        int count = inversionCount(arr);
        System.out.println("Number of inversions are: " + count);
    }
}
/// But this is taking O(N^2) time complexity. We can solve this problem in O(N log N) time complexity using merge sort.