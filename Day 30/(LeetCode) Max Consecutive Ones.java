Problem :

Given a binary array nums, return the maximum number of consecutive 1's in the array.

Solution :

class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int n = nums.length;
        int cc=0;
        int mc=0;
        for(int i = 0; i<n;i++)
        {
            if(nums[i]==1)
            {
                cc++;
                mc=Math.max(cc,mc);
            }
            else
            {
                cc=0;
            }
        }
        return mc;
    }
}
