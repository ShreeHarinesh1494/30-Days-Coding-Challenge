Problem :
Find the Second Largest Element in an array

Solution :

import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSecondLargest(int n, int[] arr) 
	{
		int high=Integer.MIN_VALUE;
		int sec=Integer.MIN_VALUE;
		boolean s=false;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>high)
			{
				sec=high;
				high=arr[i];
				s=true;
			}
			else if(arr[i]<high && arr[i]>sec)
			{
				sec=arr[i];
				s=true;
			}
		}
		if(s && sec!=Integer.MIN_VALUE)
		{
			return sec;
		}
		else
		{
			return -1;
		}
	}
}
