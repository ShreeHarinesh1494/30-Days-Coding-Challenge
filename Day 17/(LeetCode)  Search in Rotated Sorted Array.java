Problem :
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity

Solution :

class Solution {
    public int search(int[] arr, int target) 
    {
        int n=arr.length;
        int l=0;
        int h=n-1;

        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(arr[l]<=arr[mid])
            {
                if(arr[l]<=target && target<=arr[mid])
                {
                    h=mid-1;
                }
                else
                {
                    l=mid+1;
                }
            }
            else
            {
                if(arr[mid]<=target && target<=arr[h])
                {
                    l=mid+1;
                }
                else
                {
                    h=mid-1;
                }
            }
        }
        return -1;
    }
}
