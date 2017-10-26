import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            long n =sc.nextLong();
            String a = Long.toString(n,2);
           // System.out.println(a);
            int x=a.length();
            String s="";
            if(x!=32)
            {
                while(x!=32)
                {
                    s+='0';
                    x++;
                }
            }
                      
            s+=a;
           // System.out.println(s+" "+s.length());
            char b[] = s.toCharArray();
            int i=31;
            while(i>-1)
            {
                if(b[i]=='0')
                    b[i]='1';
                else
                    b[i]='0';
                i--;
            }
            String s1 = new String(b);
           // System.out.println(s1);
            Long x1 = Long.parseLong(s1,2);
            System.out.println(x1);
            t--;
        }
    }
}
