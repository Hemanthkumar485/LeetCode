class Solution {
    public int countOdds(int l, int h) {
        // long c = 0;
        // if(low == 0 && high == 1000000000) {
        //     return 500000000;
        // }
        // if(low == 1000000000 && high == 1000000000){
        //     return 0;
        // }
        // for(int i = low; i <= high; i++) {
        //     if(i % 2 != 0) {
        //         c++;
        //     }
        // }
        // return (int)c;
        return (h - l) / 2 + ((l % 2 == 1 || h % 2 == 1) ? 1 : 0);
    }
}