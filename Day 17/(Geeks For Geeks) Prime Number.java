Problem :
For a given number N check if it is prime or not. A prime number is a number which is only divisible by 1 and itself.

Solution :
class Solution{
    static int isPrime(int n)
    {
        if(n<=1)
        {
            return 0;
        }
        double m = Math.sqrt(n);
        for(int i=2;i<=m;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
}
