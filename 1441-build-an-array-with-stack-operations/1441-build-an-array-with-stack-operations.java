class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> al = new ArrayList<>();
        int in = 0;
        for(int i = 1; i <= n && in < target.length; i++) {
            al.add("Push");
            if(i == target[in]) {
                in++;
            }
            else {
                al.add("Pop");
            }
        }
        return al;
    }
}