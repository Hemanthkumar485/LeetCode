class Solution {
    public int thirdMax(int[] arr) {
        Set<Integer> hs = new HashSet<>();
        for(int i : arr){
            hs.add(i);
        }
        List<Integer> al = new ArrayList<>(hs);
        Collections.sort(al);
        int n = al.size();
        if(al.size() == 2){
            return al.get(n-1);
        }
        else if(al.size() == 1){
            return al.get(0);
        }
        else{
            return al.get(n-3);
        }
    }
}