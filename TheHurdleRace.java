import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] h = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            h[height_i] = in.nextInt();
        }
        int m=k;
        for(int height_i=0; height_i < n; height_i++){
            if(m<h[height_i])
                m=h[height_i];
        }
        System.out.println(m-k);
        // your code goes here
    }
}
