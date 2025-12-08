class Solution {
    public int minimumChairs(String s) {
        int e = 0;
        int l = 0;
        char[] arr =s.toCharArray();
        for(char i : arr){
            if(i == 'E'){
                e++;
                l = Math.max(e,l);
            }
            if(i == 'L' && l >= 0){
                e--;
            }
        }
        return l;
    }
}