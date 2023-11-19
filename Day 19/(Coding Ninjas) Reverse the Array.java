Problem :
Reverse the Array using two Pointer Concept

Solution :
  
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int st=m+1;
        int et=arr.size()-1;
        while(st<=et)
        {
            int temp=arr.get(st);
            arr.set(st,arr.get(et));
            arr.set(et,temp);
            st++;
            et--;
        }
    }
}
