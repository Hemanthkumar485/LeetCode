class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                arr[l++] = num;
            } else {
                arr[r--] = num;
            }
        }
        return arr;
    }
}
