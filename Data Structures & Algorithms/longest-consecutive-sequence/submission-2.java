class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }
        int longest = 0;
        for(int s : set) {
            int count = 0;
            if(!set.contains(s-1)) {
                while(set.contains(s+count)) {
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
