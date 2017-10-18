/*Enter your code here. Read input from STDIN. Print your output to STDOUT*/
#include <iostream>
#include<cmath>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++)
	cin>>a[i];
	int e=0,o=0;
	for(int i=0;i<n;i++)
	{
	    if(i%2==0)
	        e+=a[i];
	    else
	        o+=a[i];
	    
	}
	cout<<abs(e-o);
	return 0;
}
