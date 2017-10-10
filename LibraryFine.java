import java.io.*;
import java.util.*;

public class Solution {
    
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();

        int f=0;
        if(y1>y2)
            f=10000;
        if(y1<y2)f=0;
        if(y1==y2 && m1>m2)
            f=500*(m1-m2);
        if(y1==y2 && m1==m2 && d1>d2)
            f=15*(d1-d2);
        if(y1==y2 && m1<=m2 && d1<=d2) 
             f=0;
        if(y1==y2 && m1<m2)f=0;
        System.out.println(f);
    }
}
