class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int n : nums) {
            if(list.isEmpty()) {
                list.add(n);
                continue;
            }
            if(list.contains(n)) return true;
            list.add(n);
        }
        return false;
    }
}