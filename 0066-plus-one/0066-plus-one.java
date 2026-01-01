class Solution {
    public int[] plusOne(int[] d) {
        for(int i = d.length-1;i>=0;i--){
            if(d[i]==9){
                d[i]=0;
            }
            else{
                d[i]++;
                return d;
            }
       } 
       int arr[]=new int[d.length+1];
       arr[0]=1;
       return arr;
    }
}







// class Solution {
//     public int[] plusOne(int[] nums) {
//         int num = 0;
//         for(int i : nums) {
//             num = num * 10 + i;
//         }
//         num += 1;
//         int j = nums.length - 1;
//         while(num > 0) {
//             int temp = num % 10;
//             nums[j] = temp;
//             num /= 10;
//         }
//         return nums;
//     }
// }
