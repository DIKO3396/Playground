#include <iostream>
using namespace std;
int main() {
    int n;
  cin>>n;
  for(int i=1;i<=n;i++)
    if(i%2==1){
      for(int j=1;j<=n;j++)
        if(j<n)
        cout<<i;
  		else
          cout<<(i+1);
  	cout<<endl;
    }
  else{
  for(int j=1;j<=n;j++)
        if(j>1)
        cout<<i;
  		else
          cout<<(i+1);
  	cout<<endl;
  }
  
    
    return 0;
}