class Solution {
    public int maximumValue(String[] strs) {
        int c = 0,a = 0;
        for(String i : strs) {
            if (i.matches("\\d+")) {
                c = Integer.parseInt(i);
            } else {
                c = i.length();
            }
            a = Math.max(c, a);
        }
        return a;
    }
}