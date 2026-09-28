class Solution {
    public int[] replaceElements(int[] arr) {
        int largest = -1;

        for(int i = arr.length-1; i>=0; i--) {
            int value = arr[i];
            arr[i] = largest;
            largest = Math.max(value, largest);
        }
        return arr;
    }
}