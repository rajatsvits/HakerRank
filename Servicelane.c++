#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n,t;
    cin>>n>>t;
    int a[n];
        for(int i=0;i<n;i++)
            cin>>a[i];
    while(t>0)
    {
        int s=0,e=0;
        cin>>s>>e;
        int m=100000;
        for(int i=s;i<=e;i++)
        {
            if(a[i]<m)
                m=a[i];
        }
        cout<<m<<endl;
        
        t--;
    }
    return 0;
}
