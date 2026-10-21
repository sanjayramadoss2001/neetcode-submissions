class Solution {
    public boolean isConsecutive(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++) {
            if(nums[i] -1 != nums[i-1]) return false;
        }
        return true;
    }
}
