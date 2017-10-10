import java.io.*;
import java.util.*;

public class Solution {
 private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        
        String s="";
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=' ')
                s+=s1.charAt(i);
        }
        int r = (int)Math.sqrt(s.length()),c =(int)Math.ceil(Math.sqrt(s.length())) ;
         
        while(r*c<s.length())
            r++;
        char a[]  =s.toCharArray();
        String s2="";
       // System.out.println(r+" "+c+" "+s.length()+" "+r*c);
        for(int i=0;i<c;i++)
        {
            //s2+=a[i];
            for(int j=i;j<s1.length();j=j+c)
            {
                s2+=a[j];
            }
            s2+=" ";
        }
       // 
        System.out.println(s2);
        
        
    }
}
