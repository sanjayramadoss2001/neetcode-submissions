class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();
        int l=1;
        int r= max;
        int res = max;
        while (l<=r) {
            int m = (l+r)/2;
            int sum = 0;
            for(int ar : piles) {
                sum += Math.ceil((double) ar/m);
            }
            if (sum <= h) {
                res = m;
                r = m-1;
            } else {
                l = m+1;
            }
        }
        return res;
    }
}
