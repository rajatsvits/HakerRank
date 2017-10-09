import java.io.*;
import java.util.*;

public class Solution {

    private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		String s[] = new String[n];
		for(int i=0;i<n;i++)
		{
			s[i] = sc.next();
		}
		
		int max=0;
		 for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					char a[] = s[i].toCharArray();
					char b[]  = s[j].toCharArray();
					int m1=0;
					for(int k=0;k<m;k++)
					{
						if(a[k]=='1'||b[k]=='1')
							m1++;
					}
					if(m1>max)
						max=m1;
				}
			}
		 System.out.println(max);
		 int c=0;
		 for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					char a[] = s[i].toCharArray();
					char b[]  = s[j].toCharArray();
					int m1=0;
					for(int k=0;k<m;k++)
					{
						if(a[k]=='1'||b[k]=='1')
							m1++;
					}
					if(m1==max)
						c++;
				}
			}
		 System.out.println(c);
	}
}
