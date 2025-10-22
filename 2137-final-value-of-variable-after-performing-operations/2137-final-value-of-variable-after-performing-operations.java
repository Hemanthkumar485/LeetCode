class Solution {
    public int finalValueAfterOperations(String[] op) {
        int a = 0;
        for(String s : op){
            if(s.equals("X++")){
                a++;
            }
            else if(s.equals("++X")){
                ++a;
            }
            else if(s.equals("X--")){
                a--;
            }
            else{
                --a;
            }
        }
        return a;
    }
}