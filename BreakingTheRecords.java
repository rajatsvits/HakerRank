import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        // Complete this function
        int max=s[0],min=s[0],m=0,mi=0;
        for(int i=0;i<s.length;i++)
        {
            if(s[i]>max)
            {
                m++;
                max=s[i];
            }
            if(s[i]<min)
            {
                mi++;
                min=s[i];
            }
        }
        return new int[]{m,mi};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
