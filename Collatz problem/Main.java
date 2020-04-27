#include<iostream>
using namespace std;
int main()
{
  int n,i=0;
  cin>>n;
  while(n!=1)
  {
    cout<<n<<endl;
    if(n%2==0)
      n=n/2;
    else
      n=3*n+1; 
    i=i+1;
  }
  cout<<"1"<<endl;
  cout<<i;
}