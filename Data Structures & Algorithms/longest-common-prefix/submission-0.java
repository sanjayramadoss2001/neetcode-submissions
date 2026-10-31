class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<strs.length; i++) {
            if(i == 0) {
                str.append(strs[i]);
            } else {
                int indx = 0;
                String val = strs[i];
                while(indx < val.length() && indx < str.length()) {
                    if(val.charAt(indx) != str.charAt(indx)) {
                        break;
                    }
                    indx++;
                }
                str.delete(indx, str.length());
            }
        }
        return String.valueOf(str);
    }
}