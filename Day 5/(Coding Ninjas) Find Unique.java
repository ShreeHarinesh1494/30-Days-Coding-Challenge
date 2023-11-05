Problem : Find unique element in an array

Solution :

public class Solution{  

    public static int findUnique(int[] arr)
    {
        int unique=0;
        for(int i=0;i<arr.length;i++)
        {
          unique^=arr[i];
        }
        return unique;
    }
}
