class Solution {
    public int reverseBits(int n) {
        String a = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<32-a.length();i++){
            sb.append('0');
        }
        sb.append(a);
        sb.reverse();
        String z = sb.toString();
        int c = Integer.parseInt(z,2);
        return c;
    }
}