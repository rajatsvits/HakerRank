import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        
        char a[]  =s.toCharArray();
        int ud=0,prev=0,c=0;
        for(int i=0;i<n;i++)
        {
            prev=ud;
            if(a[i]=='U')
                ud++;
            else
                ud--;
            if(prev<0&&ud==0)
                c++;
        }
        System.out.println(c);
    }
}
