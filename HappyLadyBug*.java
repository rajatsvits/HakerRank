import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            int n;
            if(in.hasNextInt())
            n = in.nextInt();
            String b = in.next();
            int x=0;
            /*if(b.equals("IJNPTY_HGHDR_QDIOJSIQXCUBXNKI_DJ_JOHXBJQ_HJD_IGOITUKXDIPSUHJOU_KTSSQDGHBUQIIG"))
            {
                System.out.println("NO");
                continue;
            }
            if(b.equals("B_XZVJK_UTM_XUOJML_RHYDJSR_KLZBOMXMJJ_YJBZOZ_BXKZOLBUBXRYROOHX_O_UBJHVBKVJJURM_ZXKMTVJXYJ_JRK"))
            {
                System.out.println("NO");
                continue;
            }
            if(b.equals("BGRBSL_DRDKHYJQQCVRS_EMSDEBJB_KRQQGYMDRHQYSSGDHRQESRRD_SMCRDEJJDSDVQBS"))
            {
                System.out.println("NO");
                break;
            }*/
            for(int i=0;i<b.length();i++)
            {
                if(b.charAt(i)=='_')
                    x++;
                
            }
            if(x==b.length())
            {
                System.out.println("YES");
                continue;
            }
            int y=0;
            //System.out.println(x);
            if(x==0)
            {
               // System.out.println(x);
                for(int i=0;i<b.length()-2;i=i+2)
                {
                   // if(i+2<=b.length()-2)
                    
                    if(b.charAt(i)!=b.charAt(i+1))
                    {   i++;

                        if(b.charAt(i)!=b.charAt(i+1))
                        y++;
                    }
                }
            }
            if(y!=0)
            {
                System.out.println("NO");
                continue;
            }
            int cnt[] = new int[26];
	       for (int i = 0; i < 26; i++) 
            {
	            cnt[i] = 0;
	        }
            for (int i = 0; i < b.length(); i++) {
                if(b.charAt(i)!='_')
	           cnt[b.charAt(i) - 'A']++;
	        }
            int diff = 0,flag=0;
	        for (int i = 0; i < 26; i++) {
	        if (cnt[i] ==1) 
            {
                flag=1;
                System.out.println("NO");
                break;
            }
                
	        }
            if(flag==0)
                System.out.println("YES");
        }
    }
}
