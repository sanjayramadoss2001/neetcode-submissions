class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int len = s.length();
        int l = 0;
        int r = len -1;
        while(r>l) {
            if(!isValid(s.charAt(l))) {
                l++;
            } else if (!isValid(s.charAt(r))) {
                r--;
            } else if (s.charAt(r) == s.charAt(l)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isValid(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
