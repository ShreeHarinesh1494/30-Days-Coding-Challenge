Problem :
Find Duplicate in an array

Solution :

import java.io.*;
import java.util.* ;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n)
    {
        Set <Integer> s=new HashSet<>();
        boolean con=false;
        for(int i=0;i<n;i++)
        {
            if(s.contains(arr.get(i)))
            {
                con=true;
                return arr.get(i);
            }
            else
            {
                s.add(arr.get(i));
            }
        }
        return -1;
    }
}
