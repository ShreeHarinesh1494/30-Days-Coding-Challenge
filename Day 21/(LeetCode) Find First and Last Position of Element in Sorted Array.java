Problem:
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Solution :

class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                ans[0]=i;

                while(i<nums.length && nums[i]==target)
                {
                    i++;
                }
                    ans[1]=i-1;
                    break;
            }
        }
        return ans;
    }
}
