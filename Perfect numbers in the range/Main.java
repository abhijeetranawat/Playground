#include<iostream>
using namespace std;
int per(int num)
{
  int sum=0;
  for(int i=1;i<=num/2;i++)
  {
    if(num%i==0)
      sum=sum+i;
  }
  if(num==sum)
    return 1;
  else
    return 0;
}
int main()
{
  int a,b;
  cin>>a>>b;
  for(int i=a;i<=b;i++)
  {
    if(per(i)==1)
      cout<<i<<" ";
  }
}