class Solution {
    public int solution(int num) {
        int answer = 0;
        int cnt = 0;
        long longNum = num;
        if(num == 1){
            return 0; 
        }
        
        while(true){
            if(longNum%2 == 0){
                longNum /= 2;
            }else{
                longNum = longNum*3 +1;
            }
            
            cnt ++;
            
            if(longNum == 1){
                answer = cnt;
                break;
            }
            if(cnt > 500){
                answer = -1;
                break;
            }
            
            
        }
        
        return answer;
    }
}