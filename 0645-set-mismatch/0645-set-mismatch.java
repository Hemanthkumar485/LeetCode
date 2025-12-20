class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n + 1];
        for (int num : nums) {
            arr[num]++;
        }        
        int dup = -1;
        int mis = -1;       
        for (int i = 1; i <= n; i++) {
            if (arr[i] == 2) {
                dup = i;
            }
            if (arr[i] == 0) {
                mis = i;
            }
        }    
        return new int[]{dup, mis};
    }
}
