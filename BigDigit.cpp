/*Enter your code here. Read input from STDIN. Print your output to STDOUT*/
#include <iostream>
using namespace std;
int main()
{
    string s;
    cin>>s;
    int  c=s[0]-'0';
    for(int i=0;i<s.size();i++)
    {
        if(c<s[i]-'0')
            c=s[i]-'0';
    }
    cout<<c;
    
	return 0;
}

