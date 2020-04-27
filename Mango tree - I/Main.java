#include<iostream>
using namespace std;
int main()
{
	int a,b,c;
  cin>>a>>b>>c;
  if(c<=(b))
    cout<<"Yes";
  if(c>b)
  { if(c%b==0||c%b==1)
    cout<<"Yes";
   else
     cout<<"No";
  }
  
}