Problem : Find the Single Element

Solution :

public class Solution {
    public static int getSingleElement(int []arr)
    {
        int res=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            res^=arr[i];
        }
        return res;
    }
}
