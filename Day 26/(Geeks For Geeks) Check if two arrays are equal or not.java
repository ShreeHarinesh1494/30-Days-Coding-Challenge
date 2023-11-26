Problem :

Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. 
Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.

Solution :

  class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        if(Arrays.equals(A,B))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
