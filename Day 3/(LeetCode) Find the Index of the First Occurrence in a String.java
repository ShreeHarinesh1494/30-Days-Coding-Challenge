Problem : Find the Index of the First Occurrence in a String

Solution :

class Solution {
    public int strStr(String haystack, String needle) 
    {
        if(needle.isEmpty())
        {
            return -1;
        }
        int ind=haystack.indexOf(needle);
        return ind;
    }
}
