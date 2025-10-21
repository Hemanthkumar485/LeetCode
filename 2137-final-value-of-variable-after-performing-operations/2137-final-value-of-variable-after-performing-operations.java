class Solution {
    public int finalValueAfterOperations(String[] op) {
        int a = 0;
        for(String s : op){
            if(s.contains("X++")){
                a++;
            }
            else if(s.contains("++X")){
                ++a;
            }
            else if(s.contains("X--")){
                a--;
            }
            else{
                --a;
            }
        }
        return a;
    }
}