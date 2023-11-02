Problem :
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
Consider the number of unique elements o

 Solution :

  class Solution 
{
    public int removeDuplicates(int[] nums)
    {
        int n=nums.length;
        int i=0;
        for(int j=0;j<n;j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
