class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int abc[] = new int[26];
        for(int i=0; i<s.length(); i++) {
            abc[(int) s.charAt(i) - 'a']++;
            abc[(int) t.charAt(i) - 'a']--;
        }
        for(int n : abc) {
            if(n!=0) return false;
        }
        return true;
    }
}
