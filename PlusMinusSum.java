import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s =new Scanner(System.in);
        int ne=s.nextInt();
        int a[] = new int[ne];
        double p=0,n=0,z=0;
        for(int i=0;i<ne;i++)
        {
            a[i]=s.nextInt();
            if(a[i]>0)
                p++;
            else if(a[i]<0)
                n++;
            else
                z++;
        }
        System.out.println(p/ne+"\n"+n/ne+"\n"+z/ne);
    }
}
