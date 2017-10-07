import java.io.*;
import java.util.*;

public class Solution {

    private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
	
			int x =0;
			if(sc.hasNextInt())
				x= sc.nextInt();
			
			
			
			long a []=new long[x];
			for(int i=0;i<x;i++)
			{
				//if(sc.hasNextInt())
				a[i] = sc.nextLong();
			}
            //System.out.println(x);
        Arrays.sort(a);
       /* for(int i=0;i<x;i++)
			{
				System.out.print(a[i]+" ");
			}*/
        long min=a[0];
            for(int i=0;i<x;i++)
            {
                while(a[i]==0)
                {
                    i++;
                }
                min =a[i];
                
               for(int j=i;j<x;j++)
               {
                   a[j]-=min;
               }
                System.out.println(x-i);
                //System.out.println(x-i+" "+a[i]+" "+min);
            }
			
	}
}
