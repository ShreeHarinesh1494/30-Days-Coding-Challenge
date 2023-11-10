Problem :
Inplace rotate matrix 90 degree

Solution :
  import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static void inplaceRotate(int[][] arr, int n) 
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}

		for(int i=0;i<n;i++)
		{
			int k=n-1;
			for(int j=0;j<n/2;j++)
			{
				int temp=arr[j][i];
				arr[j][i]=arr[k][i];
				arr[k][i]=temp;
				k--;
			}
		}
	}

}
