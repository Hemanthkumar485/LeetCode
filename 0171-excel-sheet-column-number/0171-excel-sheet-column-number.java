class Solution {
    public int titleToNumber(String c) {
        if(c.length() == 0) {
            return -1;
        }
        int s = 0;
        for(char ch : c.toUpperCase().toCharArray()) {
            s *= 26;
            s += ch - 'A' + 1;
        }
        return s;
    }
}