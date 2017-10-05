import java.io.*;
import java.util.*;

public class Solution {
private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int t = sc.nextInt();
        while(t>0)
		{
			
			int x =0;
			if(sc.hasNextInt())
				x= sc.nextInt();
            int y =0;
			if(sc.hasNextInt())
				y= sc.nextInt();
            int c=0;
            for(int i=1;i*i<=y;i++)
            {
                if(i*i>=x&&i*i<=y)
                    c++;
            }
            System.out.println(c);
            t--;
        }
		    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
