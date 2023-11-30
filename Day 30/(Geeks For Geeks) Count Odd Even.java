Problem :

Given an array A[] of N elements. The task is to count number of even and odd elements in the array.

Solution :

  class Solution
{
    public void countOddEven(int[] arr, int n)
    {
        int e=0;
        int o=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                e++;
            }
            else
            {
                o++;
            }
        }
        System.out.println(o+" "+e);
    }
}
