Problem:

Left Rotate an Array by One

Solution :

import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] arr, int n) 
    {
        int temp[] = new int[n];
        int k=0;
        for(int i=1;i<n;i++)
        {
            temp[k]=arr[i];
            k++;
        }

        for(int i=0;i<1;i++)
        {
            temp[k]=arr[i];
            k++;
        }

        for(int i=0;i<n;i++)
        {
            arr[i]=temp[i];
        }
        return arr;

    }
}
