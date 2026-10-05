class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()) {
            if(map.containsKey(c) && stk.size() != 0) {
                if(stk.peek() != map.get(c)) {
                    return false;
                } else {
                    stk.pop();
                }
            } else {
                stk.push(c);
            }
        }
        return stk.size() == 0;
    }
}
