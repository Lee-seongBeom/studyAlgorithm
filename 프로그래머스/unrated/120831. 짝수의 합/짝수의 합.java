class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean flag = true;
        if(n%2 == 0){
            while(true){
                answer += n;
                if(n <= 0) break;
                n -= 2;
            }    
        }else{
            while(true){
                if(flag){
                    answer += n-1;    
                    flag = false;
                }else{
                    answer += n;
                }
                n -= 2;
                if(n <= 1) break;
                
                
            }
            
        }
        
        
        
        
        return answer;
    }
}