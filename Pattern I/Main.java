#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  //cout<<n;
  for(int i=0;i<=3;i++)
  {
    for(int j=1;j<=i+1;j++)
      cout<<n+i;
    cout<<endl;
  }
  for(int i=3;i>=0;i--)
  {
    for(int j=1;j<=i+1;j++)
      cout<<n+i;
    cout<<endl;
  }
  
}