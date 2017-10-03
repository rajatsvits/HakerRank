import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int x= sc.nextInt();
            int k=sc.nextInt();
            int a[] = new int[x];
            for(int i=0; i<x; i++)
            {
                a[i]=sc.nextInt();
            }
            int s=0;
            Arrays.sort(a);
            for(int i=0; i<x; i++)
            {
                if(a[i]<=0)
                    s++;
                else 
                {
                    if(s>=k)
                    {
                        System.out.println("NO");
                        break;
                    }
                    else
                    {
                        System.out.println("YES");
                        break;
                    }
                }
                //System.out.println(s+" "+a[i]);
            }
            
            t--;
        }
    }
}
