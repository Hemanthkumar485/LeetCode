import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public int strStr(String a, String b) {
        Pattern pat=Pattern.compile(b);
        Matcher mat=pat.matcher(a);
        if(mat.find()){
            return mat.start();
        }
        else{
            return -1;
        }
    }
}