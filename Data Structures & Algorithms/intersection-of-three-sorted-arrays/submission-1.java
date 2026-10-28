class Solution {
    public int[] arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : arr1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for(int n : arr2) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for(int n : arr3) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int length = 0;
        for(int n : map.values()) {
            if(n == 3) {
                length++;
            }
        }
        int num[] = new int[length];
        int indx = 0;
        for(Map.Entry<Integer, Integer> val : map.entrySet()) {
           if(val.getValue() == 3) {
             num[indx++] = val.getKey();
           }
        }
        Arrays.sort(num);
        return num;
    }
}
