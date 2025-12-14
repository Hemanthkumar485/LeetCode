class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> hs = new HashSet<>();
        for(int i : nums) {
            hs.add(i);
        }
        List<Integer> al = new ArrayList<>();
        for(int i = 1; i <= nums.length;i++) {
            if(!hs.contains(i)) {
                al.add(i);
            }
        }
        return al;
    }
}