import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0)
        {
            int x=sc.nextInt();
            int s=1;
            for(int i=0;i<x;i++)
            {
                if(i%2==0)
                    s+=s;
                else
                    s+=1;
                //System.out.println(s);
            }
            System.out.println(s);
            t--;
        }
    }
}
