import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
       // System.out.println(a.length);
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int b[] =new int[n];
        for(int a0 = 0; a0 < n; a0++)
        {
            b[(int)((a0+k)%n)]=a[a0];
        }
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(b[m]);
        }
    }
}
