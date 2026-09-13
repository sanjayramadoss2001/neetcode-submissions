class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        List<Character> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            list.add(Character.valueOf(s.charAt(i)));
        }
        for(int i=0; i<t.length(); i++) {
            if(list.contains(Character.valueOf(t.charAt(i)))) {
                list.remove(Character.valueOf(t.charAt(i)));
            }
        }
        if(list.isEmpty()) return true;
        return false;
    }
}
