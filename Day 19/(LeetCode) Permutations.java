Problem:
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order

Solution :

class Solution {
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(result,nums,0);
        return result;
    }

    void backtrack(List<List<Integer>> result,int nums[],int start)
    {
        if(start==nums.length)
        {
            result.add(toList(nums));
        }
        else
        {
            for(int i=start;i<nums.length;i++)
            {
                swap(i,nums,start);
                backtrack(result,nums,start+1);
                swap(i,nums,start);
            }
        }
    }

    List<Integer> toList(int nums[])
    {
        List<Integer> res = new ArrayList<>();
        for(int i :nums)
        {
            res.add(i);
        }
        return res;
    }

    void swap(int a,int nums[],int b)
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
