import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        char s[][] = new char[n][n];
        for(int i=0;i<n;i++)
            s[i] = grid[i].toCharArray();
        
        for(int i=1;i<n-1;i++)
			{
				for(int j=1;j<n-1;j++)
				{
					if(s[i][j]>s[i][j-1]&&s[i][j]>s[i][j+1]&&s[i][j]>s[i-1][j]&&s[i][j]>s[i+1][j])
                    {
                        s[i][j]='X';
                    }
				}
			}
        for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(s[i][j]);
				}
                System.out.println();
			}
    }
}
