import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] s, int d, int m){
        // Complete this function
        if(m>s.length)
            return 0;
        int p=0,c=0;
        for(int i=0;i<m;i++)
        {
            p+=s[i];
        }
        if(p==d)
            c++;
        if(m==s.length)
            return c;
        for(int i=m;i<s.length;i++)
        {
            p-=s[i-m];
            p+=s[i];
            if(p==d)
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
