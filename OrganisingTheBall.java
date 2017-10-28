import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[][] M = new int[n][n];
            for(int M_i=0; M_i < n; M_i++){
                for(int M_j=0; M_j < n; M_j++){
                    M[M_i][M_j] = in.nextInt();
                }
            }
            int r[]  =new int[n];
            int c[] = new int[n];
            int f=0;
            for(int i=0;i<n;i++)
			{
               
                for(int k=0;k<n;k++)
                {
                    r[i]+=M[i][k];
                }
                
				for(int j=0;j<n;j++)
				{
					c[i]+=M[j][i];
				}
                
			}
            Arrays.sort(r);
            Arrays.sort(c);
            for(int i=0;i<n;i++)
            {
                if(r[i]!=c[i])
                {
                    f=1;
                    System.out.println("Impossible");
                    break;
                }
            }
            if(f==0)
                System.out.println("Possible");
            // your code goes here
        }
    }
}
