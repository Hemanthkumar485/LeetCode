class Solution {
    public int countDigits(int num) {
        int c = 0;
        int temp = num;
        while(temp > 0) {
            int k = temp % 10;
            if(num % k == 0) c++;
            temp /= 10; 
        }
        return c;
    }
}