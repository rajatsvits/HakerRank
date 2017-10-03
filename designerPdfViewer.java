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
}
