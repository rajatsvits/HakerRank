import java.io.*;
import java.util.*;

public class Solution {

   // private Scanner sc;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[][] = new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        int x=0,y=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                if(i==j)
                x+=a[i][j];
            }
        //for(int i=n-1;i>=0;i--)
         for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                if(i+j==n-1)
                y+=a[i][j];
                //System.out.println(y);
            }
        System.out.println(Math.abs(x-y));
        
        
        
    }
}
