class Solution {
    public int minimumBoxes(int[] apple, int[] arr) {
        int s = 0, c = 0;
        Arrays.sort(arr);
        for(int i : apple) {
            s += i;
        }
        for(int i = arr.length-1; i >= 0; i--) {
            c++;
            s -= arr[i];
            if(s <= 0) {
                return c;
            }
        }
        return c;
    }
}