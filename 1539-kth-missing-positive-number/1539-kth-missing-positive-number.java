class Solution {
    public int findKthPositive(int[] arr, int k) {
        int m = 0;
        int c = 1;
        int i = 0;
        while(true){
            if(i < arr.length && arr[i] == c){
                i++;
            }
            else{
                m++;
                if(m == k){
                    return c;
                }
            }
            c++;
        }
    }
}