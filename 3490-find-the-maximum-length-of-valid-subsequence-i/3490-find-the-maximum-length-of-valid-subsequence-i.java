class Solution {
    public int maximumLength(int[] nums) {
        int[] c = new int[2]; 
        int[] e = new int[2];   

        for (int num : nums) {
            int p = num % 2;
            c[p]++;
            e[p] = e[1 - p] + 1;
        }
        return Math.max(
            Math.max(c[0], c[1]),
            Math.max(e[0], e[1])
        );
    }
}














// class Solution {

//     public int maximumLength(int[] nums) {
//         int res = 0;
//         int[][] patterns = { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 } };
//         for (int[] pattern : patterns) {
//             int cnt = 0;
//             for (int num : nums) {
//                 if (num % 2 == pattern[cnt % 2]) {
//                     cnt++;
//                 }
//             }
//             res = Math.max(res, cnt);
//         }
//         return res;
//     }
// }