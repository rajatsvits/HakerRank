#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main(){

    int hr,mn;
    string sen[31];

    sen[1] = "one";
    sen[2] = "two";
    sen[3] = "three";
    sen[4] = "four";
    sen[5] = "five";
    sen[6] = "six";
    sen[7] = "seven";
    sen[8] = "eight";
    sen[9] = "nine";
    sen[10] = "ten";
    sen[11] = "eleven";
    sen[12] = "twelve";
    sen[13] = "thirteen";
    sen[14] = "fourteen";
    sen[15] = "quarter";
    sen[16] = "sixteen";
    sen[17] = "seventeen";
    sen[18] = "eighteen";
    sen[19] = "nineteen";
    sen[20] = "twenty";
    sen[21] = sen[20] + " "+ sen[1];
    sen[22] = sen[20] + " "+ sen[2];
    sen[23] = sen[20] + " "+ sen[3];
    sen[24] = sen[20] + " "+ sen[4];
    sen[25] = sen[20] + " "+ sen[5];
    sen[26] = sen[20] + " "+ sen[6];
    sen[27] = sen[20] + " "+ sen[7];
    sen[28] = sen[20] + " "+ sen[8];
    sen[29] = sen[20] + " "+ sen[9];
    sen[30] = "half";
    cin >> hr >> mn;
    string ans;
    if (mn == 0) {
        ans = sen[hr] + " o' clock";
    }
    else if (mn <= 30) {
        string tmp1 = ((mn) == 1 ? "" : "s");
        string tmp2 = (mn != 30 && mn != 15 ? " minute"+ tmp1 : "");
        ans = sen[mn] + tmp2 + " past "+ sen[hr];
    }
    else if (mn > 30) {
        string tmp1 = ((mn) == 1 ? "" : "s");
        ans = sen[60 - mn]+ (mn != 45 ? " minute" + tmp1 : "")+ " to " + sen[hr + 1];
    }
    cout << ans << endl;
    return 0;
}
