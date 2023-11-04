Problem :
Find Character Case

Solution :

import java.util.*;
class Solution {
	
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		char str=sc.next().charAt(0);
		if(str>=97 && str<=122)
		{
			System.out.println(0);
		}
		else if(str>=65 && str<=90)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(-1);
		}
		
	}
}
