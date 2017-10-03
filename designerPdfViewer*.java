import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String w = in.next();
       
        int m=0;
        for(int h_i=0; h_i < w.length(); h_i++)
        {
           
                if(m<h[w.charAt(h_i)-'a'])
                {
                   m=h[w.charAt(h_i)-'a'] ;  
            }
        }System.out.println(w.length()*m);
    }
}





/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String w = in.next();
         int[] a = new int[26];
        for(int h_i=0; h_i < w.length(); h_i++)
        {
            a[w.charAt(h_i)-'a']++;
        }
        // int[] h = new int[26];
        int m=0,inx=0;
        for(int h_i=0; h_i < 26; h_i++)
        {
            if(a[h_i]!=0)
            {
                if(m<=h[h_i])
                {
                    if(m==h[h_i])
                    {
                        if(a[inx]<a[h_i])
                        {
                           inx=h_i;
                            m=h[h_i] ;
                        }
                    }
                    else
                    {
                        inx=h_i;
                            m=h[h_i] ;
                    }
                    
                }
            }
        }System.out.println(w.length()*m);
        
    }
}*/

/*
#include <bits/stdc++.h>

using namespace std;

int a[42];
char s[1231212];

int main() {
  for (int i = 0; i < 26; i++) {
    scanf("%d", a + i);
  }
  scanf("%s", s);
  int h = 0;
  int w = 0;
  for (int i = 0; s[i]; i++) {
    w++;
    h = max(h, a[s[i] - 'a']);
  }
  printf("%d\n", h * w);
  return 0;
}*/
