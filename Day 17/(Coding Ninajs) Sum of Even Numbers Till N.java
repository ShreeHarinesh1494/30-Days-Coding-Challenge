Problem :
Sum Of Even Numbers Till N

Solution :
import java.util.* ;
import java.io.*; 
public class Solution {
	public static long evenSumTillN(int n) 
	{
		long even=0;
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)
			{
				even+=i;
			}
		}
		return even;
	}
}
