Problem :
Given an array of size N. The task is to rotate array by D elements where D ≤ N.

Solution :  

  class Solution {
    void leftRotate(int[] arr, int n, int d)
    {
        int temp[]=new int[n];
        int k=0;
        for(int i=d;i<n;i++)
        {
            temp[k]=arr[i];
            k++;
        }
        for(int i=0;i<d;i++)
        {
            temp[k]=arr[i];
            k++;
        }
        for (int i = 0;i<n;i++) 
        {
            arr[i] = temp[i];
        }
    }
}
