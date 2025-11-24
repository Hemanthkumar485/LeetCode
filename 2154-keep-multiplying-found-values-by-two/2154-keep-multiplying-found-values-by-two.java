class Solution {
    public int findFinalValue(int[] nums, int o) {
        Arrays.sort(nums);
        for(int i : nums){
            if(i == o){
                o = o*2;
            }
        }
        return o;
    }
}