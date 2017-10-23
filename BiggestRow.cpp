/*Enter your code here. Read input from STDIN. Print your output to STDOUT*/
#include <iostream>
using namespace std;
int main()
{
    int s,m;
    cin>>s>>m;
    int a[s][m];
    
    for(int i=0;i<s;i++)
    {
        for(int j=0;j<m;j++)
            cin>>a[i][j];
    }
    int b[s]={0};
    for(int i=0;i<s;i++)
    {
        int x=0;
        for(int j=0;j<m;j++)
            x+=a[i][j];
        b[i]=x;
    }
    int c=b[0],r=0;
    for(int i=0;i<s;i++)
    {
        if(c<b[i])
        {
            c=b[i];
            r=i;
        }
    }
    cout<<"Row "<<r+1;
    
	return 0;
}
