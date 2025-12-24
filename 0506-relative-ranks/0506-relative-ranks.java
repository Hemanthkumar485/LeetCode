class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int n = nums.length;
        String[] str = new String[n];
        int[] arr = nums.clone();
        Arrays.sort(arr);
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(arr[n - 1 - i], i + 1);
        }
        for (int i = 0; i < n; i++) {
            int r = hm.get(nums[i]);
            if (r == 1) {
                str[i] = "Gold Medal";
            } else if (r == 2) {
                str[i] = "Silver Medal";
            } else if (r == 3) {
                str[i] = "Bronze Medal";
            } else {
                str[i] = String.valueOf(r);
            }
        }

        return str;
    }
}
