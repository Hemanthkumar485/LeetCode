class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> sl = new TreeSet<>();
        for(int n : nums){
           sl.add(n); 
        }
        int a=0;
        for(int x:sl){
            nums[a++]=x;
        }
        return sl.size();
    }
}
