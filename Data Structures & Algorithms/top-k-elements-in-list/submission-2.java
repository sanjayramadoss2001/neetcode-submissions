class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int arr[] = new int[k];
        List<int[]> lst = new ArrayList<>();
        for(Map.Entry<Integer, Integer> mp : map.entrySet()) {
            lst.add(new int[] {mp.getValue(), mp.getKey()});
        }
        lst.sort((a,b) -> b[0] - a[0]);

        for(int i=0; i<arr.length; i++) {
            arr[i] = lst.get(i)[1];
        }
        return arr;
    }
}
