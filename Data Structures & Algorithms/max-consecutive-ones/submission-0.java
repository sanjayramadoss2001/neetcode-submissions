class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int res = 0;
        for(int n : nums) {
            if(n==1) {
                count += 1;
            } else {
                count = 0;
            }
            res = Math.max(count, res);
        }
        return res;
    }
}