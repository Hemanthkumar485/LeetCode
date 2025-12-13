// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int a = 0,c = 0;
//         for(int i = 0;i < nums.length;i++) {
//             if(nums[i] == 1) {
//                 c++;
//             }
//             else{
//                 c = 0;
//             }
//             a = Math.max(c, a);
//         }
//         return a;
//     }
// }

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int a=0;
        int b=0;
        for(int i:nums){
            if(i==1){
                b++;
                a=Math.max(a,b);
            }
            else{
                b=0;
            }
        }
        return a;
    }
}