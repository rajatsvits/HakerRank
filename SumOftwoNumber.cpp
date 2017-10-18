/*Enter your code here. Read input from STDIN. Print your output to STDOUT*/
#include <iostream>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int a[1000000],b[n];
	for(int i=0;i<n;i++)
	{
	    cin>>b[i];
	    a[b[i]]++;
	}
	int m,f=0;
	cin>>m;
	for(int i=0;i<n;i++)
	{
	    int x=m-b[i];
	    if(a[x]>0)
	   {
	       f=1;
	       cout<<"True";
	       break;
	   }
	}
	if(f==0)
	    cout<<"False";
	
}
