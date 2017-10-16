package codeFight;

import java.util.Scanner;

//arcissistic pluperfect digital invariant (PPDI)
public class NarcissisticNumber {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int t = sc.nextInt();
		//String s=Integer.toString(t);
		int x=0,z=t,c=0,q=t;
		while(q>0)
		{
			c++;
			
			
				q/=10;
		}
		//System.out.println(c);
		while(t>0)
		{
			
			int y=t%10;
			x+=(int)Math.pow(y, c);
			
			
			t/=10;
		}
		//System.out.println(x);
		if(x==z)
			System.out.println("YES");
		
	}
}
