/*Enter your code here. Read input from STDIN. Print your output to STDOUT*/
#include <iostream>
#include<string>
#include<cmath>;
using namespace std;
int main()
{
	int n;
	cin>>n;
	//int d = stoi(n, nullptr, 2);
	int y=0,twoPower=0;
	while(n>0)
	{
	    int x=n%10;
	    y+= x*pow(2,twoPower);
	    twoPower++;
	    n/=10;
	    
	}
	cout<<y;
}
