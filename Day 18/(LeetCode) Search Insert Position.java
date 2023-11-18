Problem :
Given a sorted array of distinct integers and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Solution :

class Solution {
    public int searchInsert(int[] arr, int target) 
    {
        int l=0;
        int h=arr.length-1;
        
        while(l<=h)
        {
            int mid = (l+h)/ 2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(arr[mid]< target)
            {
                l=mid+1;
            }
            if(arr[mid] > target)
            {
                h= mid-1;
            }
        }
        return l;

        
    }
}
