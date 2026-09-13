class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {
        sort(pairs, 0, pairs.size() - 1);
        return pairs; 
    }

    public void sort(List<Pair> pairs, int s, int e) {
        if (s >= e) return;

        Pair pivot = pairs.get(e);   // FIX 1

        int left = s;

        for (int i = s; i < e; i++) {   // FIX 2
            if (pairs.get(i).key < pivot.key) {
                Pair temp = pairs.get(i);
                pairs.set(i, pairs.get(left));
                pairs.set(left, temp);
                left++;
            }
        }

        // place pivot in correct position
        Pair temp = pairs.get(left);
        pairs.set(left, pairs.get(e));
        pairs.set(e, temp);

        sort(pairs, s, left - 1);
        sort(pairs, left + 1, e);
    }
}
