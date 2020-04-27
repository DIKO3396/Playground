#include<iostream>
using namespace std;
int main()
{
  int n,b=0,temp;
  cin>>n;
  temp=n;
  while(n!=0)
  {
    b=b+n%10;
    n=n/10;
  }
  if(temp%b==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}