Problem :
Copy and reverse the Array

Solution :

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] copyAndReverse(int[] arr, int n) 
    {
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        return arr;
    }
}
