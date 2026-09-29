class Solution {
    public int scoreOfString(String s) {
        int count = 0;
        for(int i=0; i<s.length()-1; i++) {
            count += Math.abs(s.charAt(i+1) - s.charAt(i));
        }
        return count;
    }
}