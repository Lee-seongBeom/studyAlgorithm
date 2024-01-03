class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(char c : myString.toCharArray()){
            if('l' > c){
                answer += "l";
            }else{
                answer += c+"";
            }
            
        }
        
        return answer;
    }
}