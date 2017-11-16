import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long surfaceArea(int[][] A) {
        // Complete this function
        int n=A.length;
        int m=A[0].length;
        long sum=n*m*2;
        if(n==1&&m==1)
            return 6;
        else if(m==1)
        {
            sum+=3*(A[0][0]+A[n-1][0]);
            for( int i=1;i<n-1;i++)
            {
                sum+=A[i][0]*2;
            }
            for(int j=0;j<n-1;j++)
            {
                sum+=Math.abs(A[j][0]-A[j+1][0]);
            }
            return sum;
        }
        else if(n==1)
        {
            sum+=3*(A[0][0]+A[0][m-1]);
            for( int i=1;i<m-1;i++)
            {
                sum+=A[0][i]*2;
            }
            
            for(int j=0;j<m-1;j++)
            {
                sum+=Math.abs(A[0][j+1]-A[0][j]);
            }
            return sum;
        }
        
        sum+=A[0][0]*2+A[n-1][0]*2+A[0][m-1]*2+A[n-1][m-1]*2;
        
        for( int i=1;i<m-1;i++)
        {
            sum+=A[0][i];
            sum+=A[n-1][i];
        }
        for( int i=1;i<n-1;i++)
        {
            sum+=A[i][0];
            sum+=A[i][m-1];
        }
        for( int i=0;i<n;i++)
        {
            for(int j=0;j<m-1;j++)
            {
                sum+=Math.abs(A[i][j+1]-A[i][j]);
            }
        }
        for( int i=0;i<m;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                sum+=Math.abs(A[j][i]-A[j+1][i]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int W = in.nextInt();
        int[][] A = new int[H][W];
        for(int A_i = 0; A_i < H; A_i++){
            for(int A_j = 0; A_j < W; A_j++){
                A[A_i][A_j] = in.nextInt();
            }
        }
        
        
        
       long result = surfaceArea(A);
        System.out.println(result);
        in.close();
    }
}
