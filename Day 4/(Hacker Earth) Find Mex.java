Problem :
You are given an integer array of length N. You have to find MEX of sth element for all
MEX of the ith element is the minimum element greater than or equal to 0 which is not present in array till the index.

Solution :
import java.util.*;
class TestClass {

    public static int[] findmex(int arr[])
    {
        int n=arr.length;
        int result []=new int[n];
        boolean seen[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<n)
            {
                seen[arr[i]]=true;
            }
            int mex=0;
            while(mex<n && seen[mex])
            {
                mex++;
            }
            result[i]=mex;
        }
        return result;
    }

    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int result[]=findmex(a);
        for(int i=0;i<n;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}
