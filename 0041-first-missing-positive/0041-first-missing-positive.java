class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int sm = 1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < sm) {
                continue;
            }
            if(nums[i] == sm) {
                sm++;
            }
            else {
                return sm;
            }
        }
        return sm;
    }
}