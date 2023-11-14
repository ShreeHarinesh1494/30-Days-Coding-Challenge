Problem :
Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

Solution :

class Solution {
    int count(int[] arr, int n, int x) 
    {
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(x==arr[i])
            {
                cnt++;
            }
        }
        return cnt;
    }
}
