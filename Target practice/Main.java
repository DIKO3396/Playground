#include<iostream>
using namespace std;
int main()
{
  int a,b=0,c,i=0;
  cin>>a;
  while(b<a)
  {
    cin>>c;
    b=b+c;
    i=i+1;
  }
  cout<<"The number of turns is "<<i;
}