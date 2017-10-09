import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        //Arrays.sort(a);
        
        int []b  = new int[101];
        for(int i=0;i<n;i++)
        {
            b[a[i]]++;
                
        }
        int m=0;
        for(int i=0;i<101;i++)
            if(b[i]>m)
                m=b[i];
      
        System.out.println(n-m);
	    
    }
}
