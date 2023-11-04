Problem :
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Solution :

class Solution {
    public int lengthOfLastWord(String s) 
    {
        String str=s.trim();
        int n=str.length();
        int cnt=0;
        for(int i=n-1;i>=0;i--)
        {
            if(str.charAt(i)!=' ')
            {
                cnt++;
            }
            else
            {
                break;
            }
        }
        return cnt;
    }
}  
