#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

bool checkBlanagrams(string w, string w2);
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int t;
    cin>>t;
    while(t>0)
    {
        string s,s1;
        cin>>s>>s1;
        bool a = checkBlanagrams(s,s1);
        if(a)
            cout<<"YES";
        else
            cout<<"NO";
        cout<<endl;
        t--;
    }
    return 0;
}

bool checkBlanagrams(string w, string w2) {
	    // int cnt[] = {0};
	    int cnt[26]={0},cnt1[26]={0};
	     for (int i = 0; i < 26; i++) {
	        cnt[i] = 0;
	    }
	    for (int i = 0; i < w.size(); i++) {
	        cnt[w[i] - 'a']++;
	    }
	    for (int i = 0; i < w2.size(); i++) {
	        cnt1[w2[i] - 'a']++;
	    }
	    for (int i = 0; i < 26; i++) {
	        if (cnt[i] > 0&&cnt1[i]>0)return true;
	    }
	    return false;
	}
