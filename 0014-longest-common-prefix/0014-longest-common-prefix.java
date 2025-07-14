class Solution {
    public String longestCommonPrefix(String[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        Arrays.sort(arr);
        String a=arr[0];
        System.out.print(a);
        int i=1;
        for( i=1;i<=a.length();i++){
            for(int j=1;j<arr.length;j++){
                if(!(arr[j].substring(0,i)).equals(a.substring(0,i))){
                    System.out.print(arr[j].substring(0,i));
                    if(i==1){
                        return "";
                    }
                    return a.substring(0,i-1);
                }
            }
        }
        if(i==a.length()+1){
            return a;
        }
        return "";
    }
}