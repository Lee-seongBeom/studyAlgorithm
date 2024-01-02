class Solution {
    public String solution(String n_str) {
        String answer = "";
        boolean bool = true;
        for(String s : n_str.split("")){
            if(bool){
                if(!s.equals("0")){
                    bool = false;
                    answer += s;
                }
            }else{
                answer += s;
            }
            
        }
        
        return answer;
    }
}