import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        ArrayList<String> arr = new ArrayList<String>();
        // a = 97 z= 122
        // A = 65 Z= 90
        System.out.println("char:"+('Z'+1));
        for(int i=0; i<s.length(); i++){
            if((int)(s.charAt(i)) == 32){
                answer += " ";
            }else{
                if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                    if((char)(s.charAt(i)+n) > 'Z'){
                        answer += (char)(s.charAt(i)+n-26);
                    }else{
                        answer += (char)(s.charAt(i)+n);
                    }
                }else{
                    if((char)(s.charAt(i)+n) > 'z'){
                        answer += (char)(s.charAt(i)+n-26);
                    }else{
                        answer += (char)(s.charAt(i)+n);
                    }
                }
            }
            
            
        }
        
        
        
        
        
        return answer;
    }
}