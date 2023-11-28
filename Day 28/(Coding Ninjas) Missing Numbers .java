Problem:
Missing Numbers 

Solution :

import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<Integer> missingNumbers(int[] arr, int n) 
	{
		Arrays.sort(arr);
		ArrayList<Integer> a = new ArrayList<>();

		int min = arr[0];
		int max=arr[arr.length-1];
		for(int i=min;i<max;i++)
		{
			if(Arrays.binarySearch(arr, i)<0)
			{
				a.add(i);
			}
		}
		return a;
	}
}
