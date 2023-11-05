Problem :
A game will be played between the first two elements of the array (i.e. arr[0] and arr[1]). 
In each round of the game, we compare arr[0] with arr[1], the larger integer wins and remains at position 0, and the smaller integer moves to the end of the array. 
The game ends when an integer wins k consecutive rounds.

Solution :

class Solution {
    public int getWinner(int[] arr, int k) 
    {
        int ini =arr[0];
        int win=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>ini)
            {
                ini=arr[i];
                win=0;
            }
            win++;
            if(win==k)
            {
                break;
            }
        }
        return ini;
    }
}  
