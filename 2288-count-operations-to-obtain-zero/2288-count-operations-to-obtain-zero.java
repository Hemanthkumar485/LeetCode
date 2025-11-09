class Solution {
    public int countOperations(int n1, int n2) {
        int c = 0;
        if(n1 == 0 || n2 == 0){
            return 0;
        }
        while(n1 != 0 ||n2 != 0){
            if(n1 < n2){
                c++;
                n2 = n2-n1;
            }
            else if(n1 > n2){
                c++;
                n1 = n1-n2;
            }
            else{
                c++;
                break;
            }
        }
        return c;
    }
}