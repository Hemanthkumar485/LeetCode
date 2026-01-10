class Solution {
    public int evalRPN(String[] arr) {
        
        Stack<Integer> st = new Stack<>();
        String num="1234567890";
        for(int i=0;i<arr.length;i++){
            if(!(arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("*") ||arr[i].equals("/"))){
                st.push(Integer.parseInt(arr[i]));
            }
            else{
                int a=st.pop();
                int b=st.pop();
                if(arr[i].equals("+")){
                    st.push(a+b);
                }
                if(arr[i].equals("-")){
                    st.push(b-a);
                }
                if(arr[i].equals("*")){
                    st.push(a*b);
                }
                if(arr[i].equals("/")){
                    st.push(b/a);
                }
            }
        }
        return st.pop();
    }
}