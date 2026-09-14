class Solution {

    public String encode(List<String> strs) {
        if (strs.size() == 0) return "";

        StringBuilder str = new StringBuilder();

        for (String s : strs) {
            str.append(s.length()).append("#").append(s);
        }

        return str.toString();
    }

    public List<String> decode(String strs) {
        List<String> lst = new ArrayList<>();

        int i = 0;

        while (i < strs.length()) {

            int j = i;

            while (strs.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(strs.substring(i, j));

            lst.add(strs.substring(j + 1, j + 1 + len));

            i = j + 1 + len;
        }

        return lst;
    }
}