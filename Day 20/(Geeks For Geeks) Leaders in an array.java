Problem :

Given an array A of positive integers. Your task is to find the leaders in the array.
An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

Solution :

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n)
    {
        ArrayList<Integer> a = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--)
        {
            if(i==n-1)
            {
                a.add(arr[i]);
                max=arr[i];
            }
            else
            {
                if(arr[i]>=max)
                {
                    a.add(arr[i]);
                    max=arr[i];
                }
            }
        }
        Collections.reverse(a);
        return a;
    }
}
