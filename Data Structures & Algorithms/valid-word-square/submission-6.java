class Solution {
    public boolean validWordSquare(List<String> words) {
        for(int i=0; i<words.size(); i++) {
            int index = 0;
            while(index < words.get(i).length()) {
                if(index >= words.size() || i >= words.get(index).length() ||                   words.get(i).charAt(index) != words.get(index).charAt(i)) {
                    return false;
                }
                index++;
            }
        }
        return true;
    }
}
