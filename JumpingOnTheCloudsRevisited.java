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
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int x=100,i=0,f=0;
        while(true){
            if(i==0&&f==1)
                break;
            else
            {
                f=1;
                if(c[i]==0)
                {
                    
                    x--;
                    i=(i+k)%n;
                }
                else
                {
                    x-=3;
                    i=(i+k)%n;
                }
            }
        }
        System.out.println(x);
    }
}
