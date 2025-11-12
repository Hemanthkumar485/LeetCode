class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> hs = new HashSet<>();
        for(int i : nums){
            hs.add(i);
        }
        int a = hs.size();
        if(n == a){
            return false;
        }
        else{
            return true;
        }
    }
}