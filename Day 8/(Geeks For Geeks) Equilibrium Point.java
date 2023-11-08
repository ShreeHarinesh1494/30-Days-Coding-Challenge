Problem :
Given an array A of n positive numbers. The task is to find the first equilibrium point in an array.
Equilibrium point in an array is an index (or position) such that the sum of all elements before that index is same as sum of elements after it.

Solution :
class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) 
    {
        long rsum=0;
        long lsum=0;
        for(int i=0;i<n;i++)
        {
            rsum+=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            rsum=rsum-arr[i];
            if(lsum==rsum)
            {
                return i+1;
            }
            lsum=lsum+arr[i];
        }
        return -1;
    }
}
