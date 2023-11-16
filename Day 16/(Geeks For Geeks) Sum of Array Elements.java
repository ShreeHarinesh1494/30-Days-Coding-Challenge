Problem :

Given an integer array arr of size n, you need to sum the elements of arr.

Solution :

class Get
{
    public static int sumElement(int arr[], int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
}
