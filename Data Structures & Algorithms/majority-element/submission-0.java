class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int highest = 0;
        int result = 0;
        for(Map.Entry<Integer, Integer> m : map.entrySet()) {
            if(m.getValue() > highest) {
                result = m.getKey();
            }
            highest = Math.max(highest, m.getValue());
        }
        return result;
    }
}