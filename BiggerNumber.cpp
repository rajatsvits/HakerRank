/*Enter your code here. Read input from STDIN. Print your output to STDOUT*/
#include <iostream>
using namespace std;
int main()
{
    string s,s1;
    cin>>s>>s1;
    int  c=s[0]-'0',c1=s[0]-'0';
    for(int i=0;i<s.size();i++)
    {
        if(c<s[i]-'0')
            c=s[i]-'0';
    }
    for(int i=0;i<s1.size();i++)
    {
        if(c1<s1[i]-'0')
            c1=s1[i]-'0';
    }
    if(c1>c)
        cout<<s1;
    else if(c1<c)
        cout<<s;
    else
        cout<<"Equal";
    
    
	return 0;
}
