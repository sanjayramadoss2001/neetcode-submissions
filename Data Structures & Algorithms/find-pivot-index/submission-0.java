class Solution {
    public int pivotIndex(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int total = 0;
        for (int n : nums) {
            list.add(total+=n);
        }
        for (int i=0; i<list.size(); i++) {
            int leftIndex = (i==0) ? 0 : list.get(i-1);
            int rightIndex = list.get(list.size() - 1) - list.get(i);
            if (leftIndex == rightIndex) return i;
        }
        return -1;
    }
}