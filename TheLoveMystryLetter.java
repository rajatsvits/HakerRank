import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int theLoveLetterMystery(String s){
        // Complete this function
        char a[] = s.toCharArray();
        int n = s.length();
        int c=0;
        for(int i=0;i<n/2;i++)
        {
            if(a[i]!=a[n-i-1])
            {
                c+=Math.abs(a[i]-a[n-i-1]);
                
            }
        }
        return c;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
    }
}


