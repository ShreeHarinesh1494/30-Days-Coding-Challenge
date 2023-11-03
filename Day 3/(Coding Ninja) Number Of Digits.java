Problem : Number of Digits

Solution :

import java.util.* ;
import java.io.*; 

public class Solution {
    static int countDigit(long x) {
        int cnt=0;
        while(x!=0)
        {
            long rem=x%10;
            cnt++;
            x=x/10;
        }
        return cnt;
        
    }
}
