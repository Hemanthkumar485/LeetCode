class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int c = 0;
        int d = 0;
        Set<Integer> hs1 = new HashSet<>();
        for(int i : nums1) {
            hs1.add(i);
        }
        Set<Integer> hs2 = new HashSet<>();
        for(int i : nums2) {
            hs2.add(i);
        }
        for(int i : nums1) {
            if(hs2.contains(i)) {
                c++;
            }
        }
        for(int i : nums2) {
            if(hs1.contains(i)) {
                d++;
            }
        }
        return new int[] {c, d};
    }
}