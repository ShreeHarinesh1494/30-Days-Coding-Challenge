Problem :

Find First and Last Position of Element in Sorted Array

Solution :

public class Solution {
    public static int[] searchRange(int []arr, int x) 
    {
        int result[] = new int[2];
        result[0]=first(arr,x);
        result[1]=last(arr,x);
        return result;
    }

    public static int first(int arr[],int x)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                return i;
            }
        }
        return -1;
    }

    public static int last(int arr[],int x)
    {
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==x)
            {
                return i;
            }
        }
        return -1;
    }
}
