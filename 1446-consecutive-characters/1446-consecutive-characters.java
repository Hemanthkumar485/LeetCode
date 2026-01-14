class Solution {
    public int maxPower(String s) {
        int c = 0;
        int Max = 0;
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1]) {
                c++;
            }
            else {
                Max = Math.max(c, Max);
                c = 0;
            }
        }
        Max = Math.max(c, Max);
        return Max + 1;
    }
}