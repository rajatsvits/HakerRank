/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        char a[] = s.toCharArray();
        //char b[] = t.toCharArray();
        String b="";
        int f=0;
        if((t.length()==0&&s.length()==0&&k>0)||(t.length()<=k)
        {
            System.out.println("Yes");
            f=1;
        }
       
        int i=0;
      
          t+=" ";
           int f1=0;
         if(s.length()>t.length())
           {
               f1=1
           }
           else
            f1=2;
        while(i<s.length()&&f==0&&f1==1)
        {
            if(s.charAt(i)!=t.charAt(i))
            {
                if(t.charAt(i)!=' ')
                {
                    k--;
                    t+=s.charAt(i);
                }
                else
                {
                    k-=2;
                    t.charAt(i)=
                }
            }
        }
    }
}/**/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        int toDelete = 0;
        int i = 0;
        while (i < s.length() && i < t.length() && s.charAt(i) == t.charAt(i)) {
            i++;
        }
        toDelete = s.length() - i;
        int ops = toDelete + (t.length() - i);
        if (ops <= k && ((k - ops) % 2 == 0 || (k - ops) > 2 * i)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
