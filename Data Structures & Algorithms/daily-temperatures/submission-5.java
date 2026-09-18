class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int res[] = new int[temperatures.length];
        for(int i=0; i<temperatures.length-1; i++) {
            int j=i+1;
            while(temperatures[j] <= temperatures[i] && j < temperatures.length-1) {
                j++;
            }
            if(temperatures[j] > temperatures[i]) {
                res[i] = j-i;
            } else {
                res[i] = 0;
            }
        }
        return res;
    }
}
