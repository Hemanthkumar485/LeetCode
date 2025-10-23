class Solution {
    public int removeElement(int[] nums, int val) {
        int a=0;
        int i=0;
        for(int x:nums){
            if(x==val){
                continue;
            }
            nums[i]=x;
            i++;
            a++;
        }
        return a;
        //System.out.print(val);
    }
}