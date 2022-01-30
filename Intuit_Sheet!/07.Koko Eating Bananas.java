class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int s = 1, e = 1000000000;
        while (s < e) {
            int m = (s + e) / 2, cnt = 0;
            for (int k : piles)
                cnt += (k + m - 1) / m;
            if (cnt > h)
                s = m + 1;
            else
                e = m;
        }
        return s;
    }
}