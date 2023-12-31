Problem :
Euiler Totient Function

Solution :
#include <bits/stdc++.h> 
using namespace std;

	int eulerTotient(int n) 
	{
    int result = n;  

    for (int p = 2; p * p <= n; ++p) {
        if (n % p == 0) {
            while (n % p == 0) {
                n /= p;
            }
            result -= result / p;
        }
    }

    if (n > 1) {
        result -= result / n;
    }

    return result;
}

