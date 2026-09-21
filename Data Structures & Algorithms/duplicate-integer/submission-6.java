class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i=0; i<nums.length-1; i++) {
            int count = i+1;
            while(count < nums.length) {
                if (nums[i] == nums[count]) return true;
                count++;
            }
        }
        return false;
    }
}