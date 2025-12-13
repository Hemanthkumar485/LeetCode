class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> al = new ArrayList<>();
        for(int i : nums) {
            String s = Integer.toString(i);
            for(char c : s.toCharArray()) {
                al.add(c - '0');
            }
        }
        return al.stream().mapToInt(Integer::intValue).toArray();
    }
}















// class Solution {
//     public int[] separateDigits(int[] nums) {
//         List<Integer> al = new ArrayList<>();
//         int temp = 0;
//         for(int i : nums) {
//             if(i >= 10) {
//                 int a = i%10;
//                 int b = i/10;
//                 temp = b;
//                 al.add(b);
//                 al.add(a);
//             }
//             else {
//                 al.add(i);
//             }
//         }
//         int[] arr = al.stream().mapToInt(Integer::intValue).toArray();
//         return arr;
//     }
// }