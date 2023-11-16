Problem :
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Solution :

  class Solution {
    public void moveZeroes(int[] nums) 
    {
        int cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[cnt++]=nums[i];
            }
        }
        while(cnt < nums.length)
        {
            nums[cnt++]=0;
        }
    }
}
