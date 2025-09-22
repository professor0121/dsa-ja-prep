#include<iostream>
#include<vector>
using namespace std;

void hello(vector<int> &arr){
    for(int ele: arr){
        cout<<ele<<endl;
    }
    cout<<"abhidhek";
}
int main(){
    vector<int> arr={1,2,3,4};
    hello(arr);
    cout<<"hello";
}