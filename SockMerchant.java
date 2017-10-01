import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        Arrays.sort(ar);
        int c=0;
        for(int i=0;i<n-1;)
        {
            if(ar[i]==ar[i+1])
            {
                c++;
                i=i+2;
            }
            else
                i++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
