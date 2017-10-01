import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int b[] =new int[5];
        for(int i=0;i<n;i++)
        {
            b[ar[i]%5]++;
            
        }
        int in=0,m=0;
        for(int i=0;i<5;i++)
        {
            if(m<b[i])
            {
                m=b[i];
                in=i;
            }
        }
        if(in==0)
            return 5;
        return in;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
