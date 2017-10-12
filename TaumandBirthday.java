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
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            if(x>z||y>z)
            {
                if(x>y)
                {
                    if((y+z)*b>x*b)
                    {
                       long c = x*b+y*w;
                        System.out.println(c); 
                    }
                    else
                    {
                        long c = (y+z)*b+y*w;
                        System.out.println(c);
                    }
                    
                }
                else 
                {
                    if((x+z)*w<y*w)
                    {
                        long c = (x+z)*w+x*b;
                        System.out.println(c);
                    }
                    else
                    {
                        long c = y*w+x*b;
                        System.out.println(c);
                    }
                    
                }
               
                
            }
            else
            {
                long c = x*b+y*w;
                    System.out.println(c);
            }
        }
    }
}
