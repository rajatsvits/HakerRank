import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        // Complete this function
        String a[] = s.split(":");
        int q = Integer.parseInt(a[0]);
       
        String b="";
       //Always use equals function while using string;
        if(a[0].equals("12")&&s.charAt(s.length()-2)=='A')
            return "00"+":"+a[1]+":"+a[2].charAt(0)+a[2].charAt(1);
        else if(!a[0].equals("12")&&a[2].charAt(2)=='A')
            return a[0]+":"+a[1]+":"+a[2].charAt(0)+a[2].charAt(1);
        else if(a[0].equals("12")&&a[2].charAt(2)=='P')
            return a[0]+":"+a[1]+":"+a[2].charAt(0)+a[2].charAt(1);
        return b=String.valueOf(q+12)+":"+a[1]+":"+a[2].charAt(0)+a[2].charAt(1);
       // return "";
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}

/*
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(); //07:05:45PM
		DateFormat inFormat = new SimpleDateFormat( "hh:mm:ssaa");
		DateFormat outFormat = new SimpleDateFormat( "HH:mm:ss");

		Date date = null;
		try {
			date = inFormat.parse(s); 
		}catch (ParseException e ){
			e.printStackTrace();
		}
		if( date != null ){
			String myDate = outFormat.format(date);
			System.out.println(myDate);
		}
	}

}
*/
