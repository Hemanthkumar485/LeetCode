class Solution {
    public boolean rotateString(String s, String g) {
        if(s.length() != g.length()) {
            return false;
        }
        String a = s + s;
        if(a.contains(g)) {
            return true;
        }
        return false;
    }
}