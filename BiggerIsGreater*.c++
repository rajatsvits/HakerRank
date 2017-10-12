#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int t=0;
    cin>>t;
    while(t>0)
    {
        string s = {"gfg"};
    cin>>s;
    bool val = next_permutation(s.begin(), s.end());
    if (val == false)
        cout << "no answer" << endl;
    else
        cout << s << endl;
        t--;
    }
    return 0;
}
