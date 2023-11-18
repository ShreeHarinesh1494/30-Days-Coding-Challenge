Problem :
Next Greater Element

Solution :

import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static int[] nextGreater(int[] arr, int n) 
	{	
		int ans[] = new int[n];
		Stack<Integer> s =new Stack<>();

		for(int i=0;i<n;i++)
		{
			if(s.size()==0)
			{
				s.push(i);
				continue;
			}

			while(s.size()>0 && arr[i] > arr[s.peek()])
			{
				ans[s.pop()] = arr[i];
			}

			s.push(i);
		}

		while(s.size()>0)
		{
			ans[s.pop()]=-1;
		}
		return ans;
		
	}

}
