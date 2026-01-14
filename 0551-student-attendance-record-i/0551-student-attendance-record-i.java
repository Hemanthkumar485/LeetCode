class Solution {
    public boolean checkRecord(String s) {
        int c = 0;
        int a = 0;
        for(char ch : s.toCharArray()) {
            if(ch == 'A') {
                c++;
                a = 0;
            }
            else if(ch == 'L') {
                a++;
                if (a >= 3) return false;
            }
            else {
                a = 0;
            }
            if (c >= 2) {
                return false;
            }
        }
        // if(s.length() < 2) return false;
        return true;
    }
}