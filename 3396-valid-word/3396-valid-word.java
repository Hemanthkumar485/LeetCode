class Solution {
    public boolean isValid(String word) {
        if (word == null || word.length() < 3) {
            return false;
        }
        boolean vow = false;
        boolean con = false;
        for (char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
            if (Character.isLetter(c)) {
                char l = Character.toLowerCase(c);
                if ("aeiou".indexOf(l) != -1) {
                    vow = true;
                } else {
                    con = true;
                }
            }
        }
        return vow && con;
    }
}

// class Solution {
//         public boolean isValid(String word) {
//             if(word.length() < 3){
//                 return false;
//             }
//             boolean vow = false;
//             boolean con = false;
//             char[] arrvow = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
//             char[] arrcon = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y','z','B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
//             int[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
//             for(int i = 0;i < word.length();i++){
//                 for (char ch : arrvow){}
//                     if(word.charAt(i) == ch){
//                         vow = true;
//                         break;
//                     }
//                 }   
//                 else if(word.charAt(i) == arrcon){
//                     con = true;
//                     break;
//                 }
//                 else if(word.charAt(i) == a){
//                     break;
//                 }
//                 else{
//                     return false;
//                 }
//             }
//         return vow && con;
//     }
// }