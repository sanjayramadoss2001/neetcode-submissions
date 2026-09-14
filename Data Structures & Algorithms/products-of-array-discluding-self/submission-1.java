class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int res[] = new int[length];
        res[0] = 1;
        for(int i=1; i<length; i++) {
            res[i] = res[i-1] * nums[i-1];
        }
        // [1, 1, 2, 8]
        int pr = 1;
        for(int i=length -1; i>=0; i--) {
            res[i] *= pr;
            pr *= nums[i];
        }
        return res;
    }
}  
