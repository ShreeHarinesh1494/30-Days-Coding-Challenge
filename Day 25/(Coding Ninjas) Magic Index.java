Problem:

Magic Index

Solution :

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int magicIndex(ArrayList<Integer> a, int n) 
    {
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i)==i)
            {
                return i;
            }
        }
        return -1;
    }
}
