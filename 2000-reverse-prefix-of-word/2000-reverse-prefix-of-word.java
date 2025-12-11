class Solution {
    public String reversePrefix(String word, char ch) {
        int c = word.indexOf(ch);
        if (c == -1) return word;
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for(int i = c;i >= 0;i--) {
            a.append(word.charAt(i));
        }
        for(int i = c + 1;i < word.length();i++) {
            b.append(word.charAt(i));
        }
        return a.toString() + b.toString();
    }
}