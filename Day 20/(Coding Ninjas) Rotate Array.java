Problem :
Rotate Array in ArrayList

Solution :

import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) 
   {
      int n = arr.size();
      ArrayList<Integer> list = new ArrayList<>();


   for (int i = 0; i < k; i++) 
   {
      list.add(arr.get(i));
   }


   for (int i = k; i < n; i++) 
   {
      arr.set(i - k, arr.get(i));
   }

   for (int i = n - k; i < n; i++) 
   {
      arr.set(i, list.get(i - (n - k)));
   }

   return arr;

    }
}
