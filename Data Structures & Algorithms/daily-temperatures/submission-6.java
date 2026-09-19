class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int res[] = new int[temp.length];
        Stack<int[]> stk = new Stack<>();
        for(int i=0; i<temp.length; i++) {
            int t = temp[i];
            while(!stk.isEmpty() && t > stk.peek()[0]) {
                int[] prev = stk.pop();
                res[prev[1]] = i - prev[1];
            }
            stk.add(new int[] {t, i});
        }
        return res;
    }
}
