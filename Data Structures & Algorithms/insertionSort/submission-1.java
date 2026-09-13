// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> result = new ArrayList<>();
        if (pairs.size() ==0) return result;
        List<Pair> first = new ArrayList<>();
        for (Pair p : pairs) {
            first.add(new Pair(p.key, p.value));
        }
        result.add(first);
        for (int i=1; i<pairs.size(); i++) {
            int j = i-1;
            while (j >= 0 && pairs.get(j).key > pairs.get(j+1).key) {
                int ke = pairs.get(j+1).key;
                String val = pairs.get(j+1).value;
                pairs.get(j+1).key = pairs.get(j).key;
                pairs.get(j+1).value = pairs.get(j).value;
                pairs.get(j).key = ke;
                pairs.get(j).value = val;
                j -= 1;
            }
            ArrayList<Pair> arr = new ArrayList<>();
            for (Pair p : pairs) {
                arr.add(new Pair(p.key, p.value));
            }
            result.add(arr);
        }
        return result;
    }
}
