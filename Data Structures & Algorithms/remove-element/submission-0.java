class Solution {
    public int removeElement(int[] nums, int val) {
        int resArr[] = new int[nums.length];
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                resArr[count] = nums[i];
                count++;
            }
        }
        for(int i=0; i<nums.length; i++) {
            nums[i] = resArr[i];
        }
        return count;
    }
}