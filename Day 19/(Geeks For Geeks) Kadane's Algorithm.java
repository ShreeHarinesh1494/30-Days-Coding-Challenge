Problem :

Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

Solution :

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int nums[], int n){
        
        if(n==0 || nums==null)
        {
            return 0;
        }
        long cursum=nums[0];
        long maxsum=nums[0];
        
        for(int i=1;i<n;i++)
        {
            if(cursum>0)
            {
                cursum+=nums[i];
            }
            else
            {
                cursum=nums[i];
            }
        maxsum=max(maxsum,cursum);
        }
        return maxsum;
    }
    
    long max(long a,long b)
    {
        if(a>b)
        {
            return a;
        }
        return b;
    }
    
}
