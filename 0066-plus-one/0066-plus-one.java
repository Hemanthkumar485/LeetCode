class Solution {
    public int[] plusOne(int[] d) {
        for(int i = d.length-1;i>=0;i--){
            if(d[i]==9){
                d[i]=0;
            }
            else{
                d[i]++;
                return d;
            }
       } 
       int arr[]=new int[d.length+1];
       arr[0]=1;
       return arr;
    }
}