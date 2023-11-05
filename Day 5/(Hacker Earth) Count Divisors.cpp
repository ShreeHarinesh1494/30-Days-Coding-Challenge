Problem
You have been given 3 integers - l, r and k. Find how many numbers between l and r (both inclusive) are divisible by k. 
You do not need to print these numbers, you just have to find their count.

Solution :-

#include <iostream>
using namespace std;
int main() 
{
	int l,r,k;
	cin>>l>>r>>k;
	int cnt=0;
	for(int i=l;i<=r;i++)
	{
		if(i%k==0)
		{
			cnt++;
		}
	}
	cout<<cnt;
	
}
