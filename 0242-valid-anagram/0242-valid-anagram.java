class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        boolean c = false;
        if(arr.length == arr1.length){
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for(int i = 0;i < s.length();i++){
            if(arr[i] == arr1[i]){
                c = true;
            }else{
                c = false;
                break;
            }
        }
        }
        return c;
    }
}