class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whites = 0;
        int minOps = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                whites++;
            }
        }
        minOps = whites;

        // Slide the window
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'W') whites++;
            if (blocks.charAt(i - k) == 'W') whites--;
            minOps = Math.min(minOps, whites);
        }

        return minOps;
    }
}
