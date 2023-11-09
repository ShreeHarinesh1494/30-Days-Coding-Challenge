Problem :
Given a square matrix of size N*N, print the sum of upper and lower triangular elements. 
Upper Triangle consists of elements on the diagonal and above it. The lower triangle consists of elements on the diagonal and below it. 
  
Solution :

  class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        int l=0;
        int r=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<=j)
                {
                    l+=matrix[i][j];
                }
                if(i>=j)
                {
                    r+=matrix[i][j];
                }
            }
        }
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(l);
        arr.add(r);
        return arr;
    }
}
