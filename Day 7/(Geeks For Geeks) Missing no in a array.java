Problem :Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
  
Solution :
  class Solution {
    int missingNumber(int array[], int n) 
    {
        int a[]=new int[n];
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        int csum=0;
        for(int i=0;i<n-1;i++)
        {
            csum+=array[i];
        }
        int missing=sum-csum;
        return missing;
    }
}
