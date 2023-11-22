Problem:

Given a sorted array arr containing n elements with possibly some duplicate, the task is to find the first and last occurrences of an element x in the given array.
Note: If the number x is not found in the array then return both the indices as -1.

Solution :

class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int l=0;
        int r=n-1;
        list.add(-1);
        list.add(-1);
        
        while(l<=r)
        {
            if(arr[l]==x && arr[r]==x)
            {
                list.add(0,l);
                list.add(1,r);
                break;
            }
            if(arr[l]!=x)
            {
                l++;
            }
            if(arr[r]!=x)
            {
                r--;
            }
        }
        return list;
    }
}
