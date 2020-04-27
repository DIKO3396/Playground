#include<iostream>
using namespace std;
int fact(int n)
{
  int a=1;
  for(int i=1;i<=n;i++)
    a=a*i;
  return a;
}
int main()
{
 int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<fact(n);
}