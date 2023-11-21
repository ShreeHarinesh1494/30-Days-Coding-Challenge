Problem:

Given two strings a and b consisting of lowercase characters.
The task is to check whether two given strings are an anagram of each other or not.
An anagram of a string is another string that contains the same characters, only the order of characters can be different.
For example, act and tac are an anagram of each other.

Solution:

bool isAnagram(string a, string b){
        
        unordered_map<char,int> map;
        for(int i=0;a[i]!='\0';i++)
        {
            map[a[i]]++;
        }
        
        for(int i=0;b[i]!='\0';i++)
        {
            if(map[b[i]]>0)
            {
                map[b[i]]--;
            }
            else
            {
                return false;
            }
        }
        return true;
        
    }
