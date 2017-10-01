import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        //int result = bonAppetit(n, k, b, ar);
        
          int s=0;
        for(int i:ar)
            s+=i;
        s-=ar[k];
       // System.out.println(s);
        if(s/2==b)
             System.out.println("Bon Appetit");
        else
         System.out.println(b-s/2);
    }
}
