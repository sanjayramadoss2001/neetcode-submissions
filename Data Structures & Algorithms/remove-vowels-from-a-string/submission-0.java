class Solution {
    public String removeVowels(String s) {
        StringBuilder str = new StringBuilder();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        for(int i=0; i<s.length(); i++) {
            if(!set.contains(s.charAt(i))) {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}
