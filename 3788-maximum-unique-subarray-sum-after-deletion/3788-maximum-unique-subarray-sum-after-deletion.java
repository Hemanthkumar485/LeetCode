class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> mp = new HashSet<>();
        for(int n  : nums){
            mp.add(n);
        }
        int c = 0;
        for(int n : mp){
            if(n > 0){
                c += n;
            }
         }
        if(c == 0){
            c = Collections.max(mp);
        }
        return c;
    }
}