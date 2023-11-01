Problem
Chef and Chefina are playing with dice. In one turn, both of them roll their dice at once.
They consider a turn to be good if the sum of the numbers on their dice is greater than 6
Given that in a particular turn Chef and Chefina got X and Y on their respective dice, find whether the turn was good.

Solution :

import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a+b>6)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}
