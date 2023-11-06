class Solution {
    public int solution(String s) {
        int answer = 0;
        if(s.substring(0)==("-")){
            answer=Integer.parseInt(s.substring(1,s.length()));
            return -answer;    
        }else{
            answer = Integer.parseInt(s);
            return answer;    
        }
        
        
    }
}