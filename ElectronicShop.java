
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getMoneySpent(int[] k, int[] d, int s){
        // Complete this function
        Arrays.sort(k);
        Arrays.sort(d);
        int i=k.length-1,j=d.length-1;
       /* while(i>-1||j>-1)
        {
            if(k[i]+d[j]<=s)
                return k[i]+d[j];
            else
            {
                if(k[i]>d[i])
                {
                    i
                }
                if(i-1!=-1)
            }    
        }*/
        int m=0;
        for(i=k.length-1;i>=0;i--)
            for(j=d.length-1;j>=0;j--)
            {
                if(k[i]+d[j]<=s)
                    if(m<=k[i]+d[j])
                        m=k[i]+d[j];
            }
        if(m!=0)
            return m;
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
