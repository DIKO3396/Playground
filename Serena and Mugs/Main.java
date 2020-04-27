#include<iostream>
using namespace std;
int main()
{
  int n,s,a[n],s1;
  cin>>n>>s;
  for(int i=0;i<n;i++)
    cin>>a[i];
  for(int i=0;i<n-1;i++)
    s1=s1+a[i];
  if(s1<s)
    cout<<"YES";
  else
    cout<<"NO";
  
}