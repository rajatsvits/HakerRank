import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grade){
        // Complete this function
        int a[]  =new int[grade.length];
        for(int i=0;i<grade.length;i++)
        {
            int five =grade[i]/5 + 1;
           // System.out.println(five);
            if(grade[i]<38)
                a[i]= grade[i];
            else if(five*5-grade[i]<3)
                a[i] =five*5;
            else
                a[i] =grade[i];
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
