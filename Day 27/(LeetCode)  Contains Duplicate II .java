Problem

  Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
    
Solution :

    class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!hm.containsKey(nums[i]))
            {
                hm.put(nums[i],i);
            }
            else
            {
                int pindex = hm.get(nums[i]);
                if(Math.abs(pindex-i)<=k)
                {
                    return true;
                }
                else
                {
                    hm.put(nums[i],i);
                }
            }
        }
        return false;
    }
}
