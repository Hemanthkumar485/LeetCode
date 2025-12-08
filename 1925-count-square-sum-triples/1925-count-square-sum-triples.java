class Solution {
    public int countTriples(int n) {
        int s = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                int c1 = i * i + j * j;
                int c = (int)Math.sqrt(c1);
                if(c * c == c1 && c <= n){
                    s++;
                }
            }
        }
        return s;
    }
}