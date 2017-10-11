import java.io.*;
import java.util.*;

public class Solution {
private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int t = sc.nextInt();
		//String s=Integer.toString(t);
		
		while(t>0)
		{
			
			
			
			long n=sc.nextLong(),c=sc.nextLong(),m=sc.nextLong();
			long x=n/c;
            long y=x,carry=0;
            while(y>0)
            {
                
                if(y%m==0)
                {
                    y=y/m;
                    //carry=0;
                }
                else
                {
                    carry+=y%m;
                    y/=m;
                }
                
                x+=y;
               // y+=carry;
                //System.out.println(carry+" "+y);
                
            }
			while(carry>=m)
            {
                x+=carry/m;
                carry/=m;
            }
			System.out.println(x);
			t--;
		}
    }
}
