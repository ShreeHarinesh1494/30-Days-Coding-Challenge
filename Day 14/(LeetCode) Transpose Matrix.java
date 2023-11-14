Problem :
Given a 2D integer array matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

Solution :
  class Solution {
    public int[][] transpose(int[][] matrix) 
    {
        int rows=matrix.length;
        int col=matrix[0].length;
        int tr[][]=new int[col][rows];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                tr[j][i]=matrix[i][j];
            }
        }
    return tr;
    }
}
