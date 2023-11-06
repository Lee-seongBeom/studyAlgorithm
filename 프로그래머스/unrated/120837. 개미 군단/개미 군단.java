class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int o = 5;
        int s = 3;
        int l = 1;
        
        while(true){
            
            if(hp/o > 0){
                answer ++;
                hp = hp - o;
            }else if(hp/s > 0){
                answer ++;
                hp = hp - s;
            }else{
                answer += hp;
                hp = hp-hp;
            }
            
            if(hp == 0){
                break;
            }
            
            
        }
        
        return answer;
    }
}