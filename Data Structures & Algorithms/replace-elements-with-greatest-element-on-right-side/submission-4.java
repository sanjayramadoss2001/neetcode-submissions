class Solution {
    public int[] replaceElements(int[] arr) {
        int highest = -1;
        for(int i=arr.length -1; i>=0; i--) {
            int val = arr[i];
            arr[i] = highest;
            highest = Math.max(highest, val);
        }
        return arr;
    }
}