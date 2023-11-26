Problem 

Transpose of a Matrix

Solution :

import java.util.* ;
import java.io.*; 
 
public class Solution {

	public static int[][] transpose(int m, int n, int[][] mat) 
	{
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=mat[j][i];
			}
		}
		return a;
	}

}
