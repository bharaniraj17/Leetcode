import java.util.TreeMap;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        for (int i = 0; i < nums1.length; i++) {
            hm.put(nums1[i][0], nums1[i][1]);
        }
        for (int i = 0; i < nums2.length; i++) {
            hm.put(nums2[i][0], hm.getOrDefault(nums2[i][0], 0) + nums2[i][1]);
        }
        int[][] res = new int[hm.size()][2];
        int i = 0;
        for (int k : hm.keySet()) {
            res[i][0] = k;
            res[i][1] = hm.get(k);
            i++;
        }
        return res;
    }
}