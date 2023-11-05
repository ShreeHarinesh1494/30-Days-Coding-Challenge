Problem
You are given an N-sided regular polygon. You have connected the center of the polygon with all the vertices, thus dividing the polygon into N equal parts.
Your task is to find the count of simple cycles that exist in the modified structure of the polygon.

Solution :

import java.util.Scanner;
public class no_of_cycles {
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    int t = s.nextInt();
    while ((t--) != 0)
    {
    int n = s.nextInt();
    System.out.print((long) n * (n - 1) + 1);
    System.out.print('\n');
    }
}
}
