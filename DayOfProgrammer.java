import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year){
        // Complete this function
        if(year==1918)
        {//normal{12} + 14 days;
            return "26.09.1918";
        }
        if(year<1919)
        {
            boolean x = year%4==0?true:false;
            if(x)
            {
                String s= "12.09.";
                s+=year;
                return s;
            }
            String s= "13.09.";
                s+=year;
                return s;
        }
        else
        {
            boolean x = year%100==0?year%400==0:year%4==0;
            if(x)
            {
                String s= "12.09.";
                s+=year;
                return s;
            }
            String s= "13.09.";
                s+=year;
                return s;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
