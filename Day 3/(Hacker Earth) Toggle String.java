Problem
You have been given a String S consisting of uppercase and lowercase English alphabets. 
You need to change the case of each alphabet in this String.
That is, all the uppercase letters should be converted to lowercase and all the lowercase letters should be converted to uppercase.
You need to then print the resultant String to output.

Solution :

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n = str.length();
        String s1="";
        for(int i =0 ; i<n ; i++)
        {
            if(str.charAt(i)>=65 && str.charAt(i)<=90)
            {
                s1+=Character.toLowerCase(str.charAt(i));
            }
            else
            {
                s1+=Character.toUpperCase(str.charAt(i));
            }
                
        }
        System.out.println(s1);
    }
}
