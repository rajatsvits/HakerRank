import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        // Complete this function
        int c=0;
        if(p==1||p==n)
            return c;
         
        if(n%2==0)
        {
            if(p>n/2)
            {
                n--;
                c=(n-p)/2 +1;
            }
            else
            {
                c=(p-2)/2+1;
            }
        }
        else
         {
            if(p>n/2)
            {
                c=(n-p)/2 ;
            }
            else
            {
                c=(p-2)/2+1;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
