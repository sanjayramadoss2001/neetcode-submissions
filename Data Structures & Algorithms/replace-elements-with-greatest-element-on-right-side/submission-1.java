class Solution {
    public int[] replaceElements(int[] arr) {
        int res[] = new int[arr.length];
        int highest = -1;
        for(int i=arr.length-1; i>=0; i--) {
            res[i] = highest;
            highest = Math.max(highest, arr[i]);
        }
        return res;
    }
}