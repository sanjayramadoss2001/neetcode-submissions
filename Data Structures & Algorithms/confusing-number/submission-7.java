class Solution {
    public boolean confusingNumber(int n) {
        Map<Character, Character> map  = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');
        char[] ch = Integer.toString(n).toCharArray();
        StringBuilder str = new StringBuilder();
        for(int i=ch.length-1; i>=0; i--) {
            if(!map.containsKey(ch[i])) {
                return false;
            }
            str.append(map.get(ch[i]));
        }
        if(str.toString().equals(Integer.toString(n))) {
            return false;
        }
        return true;
    }
}
