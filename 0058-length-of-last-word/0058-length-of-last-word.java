class Solution {
    public int lengthOfLastWord(String s){
        String[] arr = s.split(" ");
        int n = arr.length;
        String a = arr[n-1];
        return a.length();
    }
}

// class Solution {
//     public int lengthOfLastWord(String s) {
//         int c = 0;
//         int i = s.length() - 1;
//         while(i >= 0 && s.charAt(i) == ' '){
//             i--;
//         }
//         while(i >= 0 && s.charAt(i) != ' '){
//             c++;
//             i--;
//         }
//         return c;
//     }
// }

// class Solution {
//     public int lengthOfLastWord(String s) {
//        String[] arr = s.split(" ");
//        return arr[arr.length - 1].length();
//     }
// }

