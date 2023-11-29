Problem :

Delete middle element from stack

Solution :

  import java.util.* ;
import java.io.*; 
public class Solution {
	public static void deleteMiddle(Stack<Integer> inputStack, int N) 
	{
		int m = inputStack.size()/2;

		inputStack.remove(m);
	}
}
