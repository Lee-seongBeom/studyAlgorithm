import java.util.*;
class Solution {
    public ArrayList solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(char c : my_string.toCharArray()){
            if(Character.isDigit(c)){
                answer.add(c-'0');
            }
            
        }
        Collections.sort(answer);
        
        
        return answer;
    }
    
}