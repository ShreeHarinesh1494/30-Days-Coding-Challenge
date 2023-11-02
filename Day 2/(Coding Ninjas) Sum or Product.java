Problem Statement

You are given a number 'N' and a query 'Q: 
If 'Q' is 1, then you have to return the sum of all integers from 1 to 'N,' else if 'Q' is equal to 2 then you have to return the product of all integers from 1 to 'N. 
  Since the product can be very large, return it modulo 10 9 +7.
For example
Given 'N' = 4, 'Q' = 1.
Then the answer is 10 because the sum of all integers between 1 and 4 are 1, 2, 3, and 4. Hence 1+ 2+ 3+ 4 is equal to 10.

 Solution :

import java.util.* ;
import java.io.*; 
public class Solution {

	public static long sumOrProduct(int n, int q) {

		long product=1;
		long sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		for(int i=1;i<=n;i++)
		{
			product*=i;
			product%=1000000007;
		}
		if(q==1)
		{
			return sum;
		}
		else
		{
			return product;
		}
		
	}

}
