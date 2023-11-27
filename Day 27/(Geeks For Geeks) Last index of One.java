Problem :

Given a string S consisting only '0's and '1's,  find the last index of the '1' present in it.

Solution :

class Solution {
    public int lastIndex( String s) 
    {
        int index = s.lastIndexOf("1");
        if(index==-1)
        {
            return -1;
        }
        else
        {
            return index;
        }
        
    }
}
