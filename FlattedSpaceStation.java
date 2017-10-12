import java.io.*;
import java.util.*;

public class Solution {
private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a []=new int[m];
        boolean b[] = new boolean [n];
			for(int i=0;i<m;i++)
			{
				a[i] = sc.nextInt();
                b[a[i]]=true;
			}
       /* Arrays.sort(a);
        for(int i=0;i<m;i++)
             System.out.print(a[i]+" ");*/
        if(n==m)
            System.out.println(0);
        else
        {
            int s=0,e=0,mx=0,es=0,f=0;
            
            for(int i=0;i<n;i++)
            {
                s=e;
                if(b[i]==true&&f==0)
                {
                    e=i;
                    es=i;
                    f=1;
                }
                else if(b[i]==true)
                {
                    e=i;
                    
                }
                if(mx<e-s)
                {
                    mx=e-s;
                }
                //System.out.println(s+" "+e+" "+mx);
            }
            //System.out.println(s+" "+e+" "+mx);
            if(b[0]==false&&es>=mx/2)
            {
                f=2;
                mx=es;
            }
            if(b[n-1]==false&&n-e-1>=mx/2&&f==1)
            {
                f=2;
                mx=n-e-1;
                
            }
            else if(b[n-1]==false&&n-e-1>=mx)
            {
                f=2;
                mx=n-e-1;
                
            }
            if(f==1)
               System.out.println(mx/2);
            else if(f==2)
                System.out.println(mx);
            
        }
		/*Arrays.sort(a);
        if(n==m)
            System.out.println(0);
        else
        {
            long mx=0;
            for(int i=0;i<m-1;i++)
            {
                if(a[i+1]-a[i]>mx)
                    mx=a[i+1]-a[i];
            }
            if(n-a[m-1]-1>mx)
                mx=n-a[m-1]-1;
            mx-=1;
            long x = (mx)/2;
            //System.out.println(x+" "+mx);
            if(mx%2==0)
                System.out.println(x);
            else
                System.out.println(x+1);
        }*/
        /*
        20 5
13 1 11 10 6

20 4
13 11 10 8
*/
    }
}
