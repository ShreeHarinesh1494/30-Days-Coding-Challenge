Problem :
Given two arrays a[] and b[] of size n and m respectively. The task is to find the number of elements in the union between these two arrays.
Union of the two arrays can be defined as the set containing distinct elements from both the arrays.
If there are repetitions, then only one occurrence of element should be printed in the union.

Solution :

  class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        Set <Integer> s=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            s.add(a[i]);
        }
        for(int i=0;i<m;i++)
        {
            s.add(b[i]);
        }
        return s.size();
    }
}
