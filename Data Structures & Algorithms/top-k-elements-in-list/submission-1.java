class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<int[]> lst = new ArrayList<>();
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            lst.add(new int[]{m.getValue(), m.getKey()});
        }
        lst.sort((a,b) -> b[0] - a[0]);
        int res[] = new int[k];
        for(int i=0; i<res.length; i++) {
            res[i] = lst.get(i)[1];
        }
        return res;
    }
}
