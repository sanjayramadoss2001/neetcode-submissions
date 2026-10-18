class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int odd = 0;
        int even = 100;
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int n : map.values()) {
            if(n % 2 == 0) {
                even = Math.min(n, even);
            } else if(n % 2 != 0) {
                odd = Math.max(n, odd);
            }
        }
        return odd - even;
    }
}