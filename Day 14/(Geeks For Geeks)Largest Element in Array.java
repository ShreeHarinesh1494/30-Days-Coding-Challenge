Problem :
Given an array A[] of size n. The task is to find the largest element in it.

Solution :
  class Compute {
    
    public int largest(int arr[], int n)
    {
        Arrays.sort(arr);
        return arr[n-1];
    }
}
