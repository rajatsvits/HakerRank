import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minSteps(int n, String B){
        // Complete this function
        char a[] = B.toCharArray();
        int c=0;
        for(int i=0;i<n-2;i++)
        {
            if(a[i]=='0'&&a[i+1]=='1'&&a[i+2]=='0')
            {
                c++;
                a[i+2]='1';
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}
