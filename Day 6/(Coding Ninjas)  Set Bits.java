Problem : Count the no of 1's in binary representation of a integer

Solution :

import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countSetBits(int n) 
	{
		int cnt=0;
		while(n!=0)
		{
			cnt+=n&1;
			n=n>>1;
		}
		return cnt;
	}
}  
