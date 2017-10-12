import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        long j=3,y=3;
        while(j<t)
        {
            y*=2;
            j+=y;
        }
        System.out.println(j-t+1);
    }
}
