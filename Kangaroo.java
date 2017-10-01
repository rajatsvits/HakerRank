import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        if(x1!=x2&&v1==v2)
            return "NO";
        
        if((v1>v2&&x1>x2)||(v1<v2&&x1<x2))
            return "NO";
        int y=Math.abs(v1-v2),z=Math.abs(x1-x2);
        if((y%z==0)||(z%y==0))
            return "YES";
         else
             return "NO";
       /* while(true)
        {
            if(x1==x2)
                return "YES";
            x1+=v1;
            x2+=v2;
            c++;
            if(c==0)
                return "NO";
        }*/
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
