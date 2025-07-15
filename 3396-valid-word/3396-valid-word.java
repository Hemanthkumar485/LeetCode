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