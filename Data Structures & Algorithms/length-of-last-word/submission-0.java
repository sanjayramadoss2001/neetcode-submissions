class Solution {
    public int lengthOfLastWord(String s) {
        String re[] = s.split(" ");
        return re[re.length-1].length();
    }
}