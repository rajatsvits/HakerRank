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
            int c=0,y=x;
            while(y>0)
            {
                int n=y%10;
                if(n!=0)
                {
                    if(x%n==0)
                        c++;
                }
                y/=10;
            }
        System.out.println(c);
            t--;
        }
    }
}
