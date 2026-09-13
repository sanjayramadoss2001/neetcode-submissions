class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        int leftSum = 0;
        for(int i =0; i<nums.length; i++) {
            leftSum += nums[i];
            int left = leftSum - nums[i];
            int rightSum = total - leftSum;
            if(rightSum == left) return i;
        }
        return -1;
    }
}