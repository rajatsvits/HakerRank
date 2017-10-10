import java.io.*;
import java.util.*;

public class Solution {
 private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
        int size=0;
        long a[] = new long[100000];
        for(long i=n;i<=m;i++)
        {
            if(i==1)
            {
                a[size]=(int)i;
                size++;
            }
            else if(i>1&&i<4);
            else
            {
                String s = Long.toString(i*i);
                //System.out.println(s.length());
                String s1 = s.substring(0,(s.length()/2));
                String s2=s.substring(s.length()/2,s.length());
                long x =Long.parseLong(s1);
                long y =Long.parseLong(s2);
                if(x+y==i)
                {
                    a[size]=i;
                    size++;
                }  
            }
        }
        if(size==0)
            System.out.println("INVALID RANGE");
        else
        {
            for(int i=0;i<size;i++)   
                System.out.print(a[i]+" ");
        }
    }
}
