Problem :
Given a string S, check if it is palindrome or not.

Solution :
  class Solution {
    int isPalindrome(String S) 
    {
        StringBuilder str=new StringBuilder();
        str.append(S);
        str.reverse();
        String s1=str.toString();
        if(S.equals(s1))
        {
            return 1;
        }
        return 0;
    }
};
