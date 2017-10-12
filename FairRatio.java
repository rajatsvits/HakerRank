import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        int c=0;
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
            if(B[B_i]%2==1)
                c++;
        }
        if(c%2==1)
            System.out.println("NO");
        else
        {
            c=0;
            for(int i=0;i<N-1;i++)
            {
                if(B[i]%2==1)
                {
                    B[i]++;
                    B[i+1]++;
                    c++;
                    c++;
                }
                
            }
            System.out.println(c);
        }
    }
}
