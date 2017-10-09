import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
          // String s1=s;
        long n = in.nextLong();
        int c=0;
        for(int i=0 ;i <s.length();i++)
        {
            if(s.charAt(i)=='a')
                c++;
        }
        long x = (n/s.length())*c;
        long y = n%s.length();
        for(int i=0 ;i <(int)y;i++)
        {
            if(s.charAt(i)=='a')
                x++;
        }
      
        System.out.println(x);
    }
}
