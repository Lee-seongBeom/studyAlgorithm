class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length()%2 ==1){
            char c= s.charAt((0+s.length())/2);
            answer = String.valueOf(c);
        }else if(s.length()%2 ==0){
            char a= s.charAt((0+s.length())/2-1);
            char b= s.charAt((0+s.length())/2);
           
            
            answer = String.valueOf(a)+String.valueOf(b);
        }
        
        return answer;
    }
}