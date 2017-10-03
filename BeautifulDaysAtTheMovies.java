import java.io.*;
import java.util.*;

public class Solution {
private static Scanner sc;

		public static void main(String[] args) {
			sc = new Scanner(System.in);
			int n = sc.nextInt();
            int e = sc.nextInt();
            int d= sc.nextInt();
            int da=0;
            for(int i=n;i<=e;i++)
            {
                int r = reverse(i);
                int x=(i-r)%d;
                    if(x==0)
                        da++;
                    
            }
            System.out.println(da);
        }
    
    static int reverse(int n)
    {
        int x=0;
        while(n>0)
        {
            x=x*10+n%10;
            n/=10;
        }
        return x;
    }
}
