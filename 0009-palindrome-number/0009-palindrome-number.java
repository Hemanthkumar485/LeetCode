class Solution {
    public boolean isPalindrome(int x) {
        String b=Integer.toString(x);
        StringBuilder sb = new StringBuilder(b);
        sb.reverse();
        String a = sb.toString();
        return a.equals(b);
        
    }
}