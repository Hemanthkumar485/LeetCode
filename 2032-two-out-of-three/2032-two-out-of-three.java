class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> hs1 = new HashSet<>();
        for(int i : nums1) {
            hs1.add(i);
        }
        Set<Integer> hs2 = new HashSet<>();
        for(int i : nums2) {
            hs2.add(i);
        }
        Set<Integer> hs3 = new HashSet<>();
        for(int i : nums3) {
            hs3.add(i);
        }
        Set<Integer> al = new HashSet<>();
        for(int i : hs1) {
            if(hs2.contains(i) || hs3.contains(i)) {
                al.add(i);
            }
        }
        for(int i : hs2) {
            if(hs1.contains(i) || hs3.contains(i)) {
                al.add(i);
            }
        }
        for(int i : hs3) {
            if(hs1.contains(i) || hs2.contains(i)) {
                al.add(i);
            }
        }
        List<Integer> ar = new ArrayList<>(al);
        return ar;
    }
}