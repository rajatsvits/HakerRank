import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b) {
        // Complete this function
        Arrays.sort(a);
        Arrays.sort(b);
        /*int y=a[a.length-1];
        for(int i:a)
        {
            if(y%i!=0)
                return 0;
        }*/
      // int lcm=a[0]*a[1]/gcd(a[0],a[1]);
        int lcm=a[0];
        for(int i=1;i<a.length;i++)
        {
            lcm=lcm*a[i]/gcd(lcm,a[i]);
        }
       // lcm=y;
        int c=0,f=0,x=lcm;
        
        while(lcm<=b[0])
        {
            for(int i=0;i<b.length;i++)
            {
                
                if(b[i]%lcm!=0)
                {
                    f=1;
                   break;
                }
            }
            if(f==1)
                f=0;
            else
                c++;
            lcm+=x;
            //System.out.println(lcm+" "+c);
            
        }
        /*for(int i=0;i<b.length;i++)
        {
            if(b[i]%b[0]!=0)
                return c;
        }
        c++;*/
        return c;
        
    }
    
    static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
