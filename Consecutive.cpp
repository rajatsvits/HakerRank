/*Enter your code here. Read input from STDIN. Print your output to STDOUT*/
#include <iostream>
using namespace std;
int main()
{
    int s;
    cin>>s;
    int a[s];
    
    for(int i=0;i<s;i++)
    {
       
            cin>>a[i];
    }
    bool b=true;
    for(int i=0;i<s-1;i++)
    {
       
        if(a[i]+1!=a[i+1])
            b=false;
    }
    if(b)
    cout<<"True";
    else
    cout<<"False";
    
	return 0;
}
