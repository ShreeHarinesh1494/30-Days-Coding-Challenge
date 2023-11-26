Problem :
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
  
Solution :
class Solution {
    public String reverseVowels(String s) 
    {
        int n=s.length();
        char ch[]= s.toCharArray();
        int st=0;
        int et=n-1;
        while(st<et)
        {
            if(!isVowel(ch[st]))
            {
                st++;
            }
            else if(!isVowel(ch[et]))
            {
                et--;
            }
            else
            {
                char temp=ch[st];
                ch[st]=ch[et];
                ch[et]=temp;
                st++;
                et--;
            }
        }
        return String.valueOf(ch);
    }

    public boolean isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
        {
            return true;
        }
        return false;
    }
}
