Problem:
An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists). 
Given an array arr[] of size N, Return the index of any one of its peak elements. 
Note: The generated output will always be 1 if the index that you return is correct. 
Otherwise output will be 0. Also, arr[] will be in ascending order before the peak element, and in descending order after that.

Solution:

  class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       int st=0;
       int et=n-1;
       
       while(st<=et)
       {
           int mid=(st+et)/2;
           
           if((mid==0 || arr[mid-1]<= arr[mid]) && (mid==n-1 || arr[mid]>=arr[mid+1]))
           {
               return mid;
           }
           else if(mid >0 && arr[mid-1] > arr[mid])
           {
               et=mid-1;
           }
           else
           {
               st=mid+1;
           }
       }
       return 1;
    }
}
