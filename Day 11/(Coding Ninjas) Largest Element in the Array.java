Problem :
Largest Element in the Array

Solution :
  import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] a, int n) 
    {
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        return max;

    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=largestElement(a, n);
        System.out.println(k);
    }
}
