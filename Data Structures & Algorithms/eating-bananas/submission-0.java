class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {
        int max = 0;
        int left = 1;
        for (int i = 0; i < piles.length; i++) 
        max = Math.max(max, piles[i]);
        
        while (left<max) 
        {
            int mid = left + (max - left) / 2;
            long hours = 0;

            for (int i = 0; i < piles.length; i++) 
            hours += (piles[i] + mid - 1) / mid;

            if (hours <= h) max = mid;
            else left = mid + 1;
        }
        return left;
    }
}
