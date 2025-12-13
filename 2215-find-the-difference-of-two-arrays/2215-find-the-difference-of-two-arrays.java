class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for(int i : nums1) {
            s1.add(i);
        }
        Set<Integer> s2 = new HashSet<>();
        for(int i : nums2) {
            s2.add(i);
        }
        List<Integer> al1 = new ArrayList<>();
        for(int i : s1) {
            if(!s2.contains(i)) {
                al1.add(i);
            }
        }
        List<Integer> al2 = new ArrayList<>();
        for(int i : s2) {
            if(!s1.contains(i)) {
                al2.add(i);
            }
        }
        List<List<Integer>> al = new ArrayList<>();
        al.add(al1);
        al.add(al2);
        return al;
    }
}