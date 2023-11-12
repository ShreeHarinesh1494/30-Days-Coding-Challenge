Problem :
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Solution :

class Solution {
    public String reverseWords(String s) 
    {
        String str[]=s.split(" ");
        StringBuilder s1=new StringBuilder();
        for(String words : str)
        {
            String s2=new StringBuilder(words).reverse().toString();
            s1.append(s2).append(" ");
        }
        return s1.toString().trim();
    }
}
