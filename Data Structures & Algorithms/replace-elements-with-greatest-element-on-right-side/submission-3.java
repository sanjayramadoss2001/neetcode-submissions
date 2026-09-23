class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int highest = -1, counter = i+1;
            while(counter < arr.length) {
                highest = Math.max(highest, arr[counter]);
                counter++;
            }
            arr[i] = highest;
        }
        return arr;
    }
}