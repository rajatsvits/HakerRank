import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int x = sc.nextInt();
        int a []=new int[x];
			for(int i=0;i<x;i++)
			{
				//if(sc.hasNextInt())
				a[i] = sc.nextInt();
			}
        int b []=new int[x];
        for(int i=0;i<x;i++)
        {
            b[a[i]-1]=i;
        }
      //  for(int i=0;i<x;i++)
        //    System.out.print(b[i]+" ");
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<x;j++)
            {
                if(b[i]==a[j]-1)
                    System.out.println(j+1);
            }
        } 
    }
}


/*
#include <bits/stdc++.h>

/*#define all(a) (a).begin(), (a).end()
#define sz(a) (int)(a).size()
#define pb push_back

using namespace std;

typedef long long ll;
typedef pair<int, int> pii;
typedef long double ld;/**/


using namespace std;
int main()
{


	int n;
	cin >> n;

	vector<int> p(n);
	for (int i = 0; i < n; ++i) {
		int x;
		cin >> x;
		--x;
		p[x] = i;
	}

	for (int i = 0; i < n; ++i) {
		cout << p[p[i]] + 1 << "\n";
	}

}
