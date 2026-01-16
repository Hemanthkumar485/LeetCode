class Solution {
    public int minimumRecolors(String blocks, int k) {
        int c = 0;
        int op = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                c++;
            }
        }
        op = c;

        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'W') c++;
            if (blocks.charAt(i - k) == 'W') c--;
            op = Math.min(op, c);
        }

        return op;
    }
}
