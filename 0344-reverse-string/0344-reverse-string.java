class Solution {
    public void reverseString(char[] s) {
        List<Character> al = new ArrayList<>();
        for(char c : s){
            al.add(c);
        }
        Collections.reverse(al);
        for (int i = 0; i < s.length; i++) {
            s[i] = al.get(i);
        }
    }
}