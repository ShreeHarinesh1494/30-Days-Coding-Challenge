Problem :

Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

Solution :

class Solution {
    public static void setZeroes(int[][] matrix) 
    {
        int n=matrix.length;
        int m=matrix[0].length;

        boolean row[]=new boolean[n];
        boolean col[]=new boolean[m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=true;
                    col[j]=true;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            if(row[i])
            {
                for(int j=0;j<m;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=0;j<m;j++)
        {
            if(col[j])
            {
                for(int i=0;i<n;i++)
                {
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}  
