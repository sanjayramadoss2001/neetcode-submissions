class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            mp.put(nums[i], i);
        }

        for (int i=0; i<nums.length; i++) {
            int j = target - nums[i];
            if (mp.containsKey(j) && mp.get(j) != i) {
                return new int[]{i, mp.get(j)};
            }
        }
        return new int[0];
    }
}
