Problem :

Remove Duplicates 

Solution :

import java.util.* ;
import java.io.*;

public class Solution {

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr) 
	{
		Set<Integer> s = new LinkedHashSet<>();
		ArrayList<Integer> a = new ArrayList<>();
		for(int e:arr)
		{
			s.add(e);
		}
		for(int e:s)
		{
			a.add(e);
		}
		return a;

	}
}
