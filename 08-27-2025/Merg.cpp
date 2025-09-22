#include<iostream>
#include<vector>

using namespace std;

void mergeSort(vector<int>& arr,int st,int end){
    if(st>=end) return;
    int mid=(st+end)/2;
    mergeSort(arr,st,mid);
    mergeSort(arr,mid+1,end);
    vector<int> temp;
    int i=st,j=mid+1;
    while(i<=mid && j<=end){
        if(arr[i]<arr[j]){
            temp.push_back(arr[i]);
            i++;
        }else{
            temp.push_back(arr[j]);
            j++;
        }
    }
    while(i<=mid) temp.push_back(arr[i++]);
    while(j<=end) temp.push_back(arr[j++]);
    for(int i=st; i<=end; i++) arr[i]=temp[i-st];
}

int main(){
    cout<<"Hello, World!"<<endl;
    vector<int> arr={5,3,7,2,8,1,0};
    for(int i=0; i<arr.size(); i++){
        cout<<arr[i]<<" ";
    }
    mergeSort(arr, 0, arr.size()-1);
    for(int i=0; i<arr.size(); i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}