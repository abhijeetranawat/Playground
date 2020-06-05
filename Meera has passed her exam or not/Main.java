#include<iostream>
using namespace std;
int main()
{
  int size;
  cin>>size;
  int flag=0;
  int arr[size];
  for(int i=0;i<size;i++)
    cin>>arr[i];
  int num;
  cin>>num;
  for(int j=0;j<size;j++)
  {
    if(num==arr[j])
      flag=1;
  }
  if(flag==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}