#include<iostream>
using namespace std;
int main()
{
  int n,a=0,b=0,c;
  cin>>n;
  while(n!=0)
  {
    c=n%10;
    n=n/10;
    if(c%2==0)
      a=a+c;
    else
      b=b+c;
  }
  if(a==b)
    cout<<"Yes";
  else
    cout<<"No";
}