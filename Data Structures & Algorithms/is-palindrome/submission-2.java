class Solution {
    public boolean isPalindrome(String s) {
        int l =0, r = s.length()-1;
        while(r>l) {
            if(!isValid(s.toLowerCase().charAt(l))) {
                l++;
            } else if (!isValid(s.toLowerCase().charAt(r))) {
                r--;
            } else if (s.toLowerCase().charAt(r) == s.toLowerCase().charAt(l)) {
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
