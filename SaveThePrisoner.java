import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long m = in.nextLong();
            long s = in.nextLong();
            long result =0;
            if(s==1)
            {
                if(m==n)
                {
                    result=m;
                    System.out.println(result);
                }
                else
                {
                    if(m%n==0)
                    result=m%n+n ;
                    else
                        result=m%n;
                    System.out.println(result);
                }
            }
            else
            {
                if(m==n)
                {
                    result=s-1;
                    System.out.println(result);
                }
                else
                {
                    if((m%n)+s-1<=n)
                        result=(m%n)+s-1;
                    else 
                        result=((m%n)+s-1)%n;
                    System.out.println(result);
                }
            }
            //System.out.println(result);
        }
    }
}
