import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int m=n,s=0,e=0;
        for(int A_i=0; A_i < n; A_i++)
        {
            for(int A_j=A_i+1; A_j < n; A_j++)
            {
                if( A[A_i]==A[A_j]&&(A_j-A_i)<m)
                    m=A_j-A_i;
            }
        }
        if(m==n)
            System.out.println(-1);
        else
        System.out.println(m);
    }
}
