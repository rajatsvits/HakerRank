import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner s =new Scanner(System.in);
        int ne=s.nextInt();
        int t=ne;
        for(int i=ne;i>0;i--)
        {
            t=i-1;
            int x=t;
            while(t>0)
            {
                System.out.print(" ");
                t--;
            }
            
            while(x<ne)
            {
                System.out.print("#");
                x++;
            }
               System.out.println();
            
        }
    }
}
