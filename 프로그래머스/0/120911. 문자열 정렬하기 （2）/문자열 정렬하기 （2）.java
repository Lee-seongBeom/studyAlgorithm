import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        answer = my_string.toLowerCase();
        
        char[] charArr = answer.toCharArray();
        
        Arrays.sort(charArr);
        
        answer = new String(charArr);
        
        return answer;
    }
}