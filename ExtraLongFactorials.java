import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {
private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int t = sc.nextInt();  
        BigInteger f= new BigInteger("1");
        for(int i=2;i<=t;i++)
            f=f.multiply(BigInteger.valueOf(i));
        System.out.println(f);
    }
}
