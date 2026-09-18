class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(String s : tokens) {
            if(s.equals("+")) {
                stk.push(stk.pop() + stk.pop());
            } else if(s.equals("-")) {
                int a = stk.pop();
                stk.push(stk.pop() - a);
            } else if(s.equals("*")) {
                stk.push(stk.pop() * stk.pop());
            } else if(s.equals("/")) {
                int a = stk.pop();
                stk.push(stk.pop() / a);
            } else {
                stk.push(Integer.parseInt(s));
            }
        }
        return stk.peek();
    }
}
