#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;


int partition(vector<int>&arr,int start,int end){
    int idx=start-1,pivot=arr[end];
    for(int i=start;i<end; i++){
        if(arr[i]<pivot){
            idx++;
            swap(arr[i],arr[idx]);
        }
    }
    idx++;
    swap(arr[idx],arr[end]);
    return idx;
}

void quickSort(vector<int>&arr,int start,int end){
    for(int element: arr){
        cout<<element<<" ";
    }
    cout<<endl;
    if(start<end){
        int pivot=partition(arr,start,end);
        quickSort(arr,start,pivot-1);
        quickSort(arr,pivot+1,end);
    }
}

int main(){
    cout<<"Hello abhishek";
    vector<int>arr={4,3,6,2,7,1,8,0};
    quickSort(arr,0,arr.size()-1);
    return 0;
}