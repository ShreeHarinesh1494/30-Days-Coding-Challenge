Problem:
Search Insert Position

Solution :

public class Solution {
    public static int searchInsert(int [] arr, int m)
    {
        int st=0;
        int et=arr.length-1;

        while(st<=et)
        {
            int mid = (st+et)/2;

            if(arr[mid]==m)
            {
                return mid;
            }
            else if(arr[mid]>m)
            {
                et=mid-1;
            }
            else
            {
                st=mid+1;
            }
        }
        return st;
    }
}
