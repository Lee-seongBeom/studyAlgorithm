import java.util.*;
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String transStr = "";
        for(String s : myString.split("")){
            if(s.equals("A")){
                transStr += "B";
            }else{
                transStr += "A";                
            }
        }
        
        if(transStr.contains(pat)){
            answer = 1;
        }
        
        return answer;
    }
}