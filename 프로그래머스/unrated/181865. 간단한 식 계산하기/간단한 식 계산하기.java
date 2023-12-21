
class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] str = new String[3];
        
        for(int i=0; i<3; i++){
            str[i] = binomial.split(" ")[i];
        }
        
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[2]);
        
        if(str[1].equals("+")){
            answer = a+b;
        }else if(str[1].equals("-")){
            answer = a-b;
        }else{
            answer = a*b;
        }
        
        
        return answer;
    }
}