class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : ransomNote.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : magazine.toCharArray()) {
            if(map.containsKey(c)) {
                int num = map.get(c) - 1;
                map.put(c, num);
            }
        }
        for(int num : map.values()) {
            if(num > 0) return false;
        }
        return true;
    }
}