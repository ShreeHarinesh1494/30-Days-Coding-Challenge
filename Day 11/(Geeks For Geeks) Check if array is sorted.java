Problem :
Given an array arr[] of size N, check if it is sorted in non-decreasing order or not. 

Solution :
  class Solution {
    boolean arraySortedOrNot(int[] arr, int n) 
    {
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
}
