class Solution {
    public int distributeCandies(int[] a) {
        Set<Integer> hs = new HashSet<>();
        for(int i : a) {
            hs.add(i);
        }
        int c = Math.min(a.length/2, hs.size());
        return c;
    }
}