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
	int e=0,o=a[0];
	for(int i=0;i<n;i++)
	{
	    if(e<a[i])
	        e=a[i];
	    if(o>a[i])
	        o=a[i];
	    
	}
	cout<<e*o;
	return 0;
}
