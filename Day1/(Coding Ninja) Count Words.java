Problem Statement

For a given input string(str), find and return the total number of words present in it.

It is assumed that two words will have only a single space in between. Also, there wouldn't be any leading and trailing spaces in the given input string.

Solution :

import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class Solution {
	
    static int  countWords(String input) 
    {
        StringTokenizer str=new StringTokenizer(input);
        int n=str.countTokens();
        return n;
    }
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int output = countWords(input);
        System.out.println(output);
		
	}
}
