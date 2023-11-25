Problem:

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Solution :

class Solution {
    public int firstUniqChar(String s) 
    {
        int freq[]= new int[26];
        char cha[]=s.toCharArray();
        for(char c:cha)
        {
            freq[c-'a']++;
        }

        for(int i=0;i<cha.length;i++)
        {
            if(freq[cha[i]-'a']==1)
            {
                return i;
            }
        }
        return -1;
    }
}
