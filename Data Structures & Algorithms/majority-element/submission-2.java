class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        int maxCount = 0;
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            if(map.get(n) > maxCount) {
                result = n;
                maxCount = map.get(n);
            }
        }
        return result;
    }
}