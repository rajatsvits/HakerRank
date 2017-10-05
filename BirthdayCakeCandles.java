import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int max, int[] ar) {
        // Complete this function
        int c=0;
        for(int i:ar)
        {
            if(i==max)
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        int max=0;
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
            if(max<ar[ar_i])
                max=ar[ar_i];
        }
        int result = birthdayCakeCandles(max, ar);
        System.out.println(result);
    }
}
