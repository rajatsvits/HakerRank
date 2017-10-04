import java.io.*;
import java.util.*;

public class Solution {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int t = sc.nextInt();
        int x=2,s=2;
        for(int i=2;i<=t;i++)
        {
            x=x*3;
            //System.out.println(s+" "+x);
            x/=2;
            s+=x;
            //System.out.println(s+" "+x);
        }
        System.out.println(s);
    }
}
