class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> re = new ArrayList<>();
        int c = 0;
        for(int i : nums){
            c = (c * 2 + i) % 5;
            re.add(c == 0);
        }
        return re;
    }
}