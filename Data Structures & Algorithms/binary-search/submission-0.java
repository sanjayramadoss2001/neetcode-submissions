class Solution {
    public int search(int[] nums, int target) {
        int R = nums.length -1;
        int L = 0;

        while(L <= R) {
            int m = (L+R)/2;
            if (target > nums[m]) {
                L = m+1;
            } else if (target < nums[m]) {
                R = m-1;
            } else {
                return m;
            }
        }
        return -1;

    }
}
