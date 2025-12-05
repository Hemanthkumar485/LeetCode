// class Solution {
//     public boolean isSubsequence(String s, String t) {
//         char[] ch = s.toCharArray();
//         char[] cc = t.toCharArray();
//         if(ch.length == 0 && cc.length == 0) return true;
//         if(cc.length == 0) return false;
//         Arrays.sort(ch);
//         Arrays.sort(cc);
//         boolean b = false;
//         for(int i = 0;i < ch.length;i++){
//             if(ch[i] != cc[i]){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] ch = s.toCharArray();
        char[] cc = t.toCharArray();

        int i = 0, j = 0;

        // traverse t with j, match characters of s using i
        while (i < ch.length && j < cc.length) {
            if (ch[i] == cc[j]) {
                i++;
            }
            j++;
        }

        return i == ch.length;  // all chars of s matched in order
    }
}
