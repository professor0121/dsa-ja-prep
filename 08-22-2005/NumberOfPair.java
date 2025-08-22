// ## 1. Given two positive integer arrays arr and brr, find the number of pairs such that xy > yx (raised to power of) where x is an element from arr and y is an element from brr.
// ```sh
// Examples :

// Input: arr[] = [2, 1, 6], brr[] = [1, 5]
// Output: 3
// Explanation: The pairs which follow xy > yx are: 21 > 12,  25 > 52 and 61 > 16 .
// Input: arr[] = [2 3 4 5], brr[] = [1 2 3]
// Output: 5
// Explanation: The pairs which follow xy > yx are: 21 > 12 , 31 > 13 , 32 > 23 , 41 > 14 , 51 > 15 .
// Constraints:
// 1 ≤ arr.size(), brr.size() ≤ 104
// 1 ≤ arr[i], brr[i] ≤ 103

// ```



class NumberOfPair{
    public int pairOfNum(int arr[],int brr[]){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<brr.length; j++){
                if(Math.pow(arr[i],brr[j])>Math.pow(brr[j], arr[i])){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String []args){
        int arr[]={2,1,6};
        int brr[]={1,5};
        NumberOfPair objectPair=new NumberOfPair();
        int count=objectPair.pairOfNum(arr, brr);
        System.out.println("the total count is "+count);
    }
}


//How can i solve this problem . because of that it taking O(N X M) time complexity .....