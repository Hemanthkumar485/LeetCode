class Solution {
    public int maxOperations(int[] nums) {
        int n = nums.length;
        if(n < 2) {
            return 0;
        }
        int c = 0;
        int ans = nums[0] + nums[1];
        for(int i = 0; i < n - 1; i+=2) {
            int a = nums[i] + nums[i + 1];
            if(a == ans) {
                c++;
            }
            else{
                break;
            }
        }
        return c;
    }
}