class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n == 1){
            answer = 1;
        }else{
            for(int i=1; i<n; i++){
                if(n%i == 0){
                    for(int j=1; j<n; j++){
                        if(n%(i*j) == 0 && i*j == n ){
                            answer++;
                        }
                    }        
                }else continue;
            }
            answer+=2;
        }
        
        
        
        
        return answer;
    }
}