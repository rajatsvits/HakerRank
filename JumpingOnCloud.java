import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int i=0,c1=0;
        if(c[0]==1&&c[1]==0)
        {
            c1++;
            i=1;
        }
        for(;i<n-2;)
        {
            if((c[i+1]==0||c[i+1]==1)&&c[i+2]==0)
            {
                c1++;
                i=i+2;
            }
            else if(c[i+1]==0&&c[i+2]==1)
            {
                i++;
                c1++;
            }
        }
        
            if(i==n-2)
            {
                if(c[n-1]==0)
                    c1++;
            }
        System.out.println(c1);
        
    }
}
