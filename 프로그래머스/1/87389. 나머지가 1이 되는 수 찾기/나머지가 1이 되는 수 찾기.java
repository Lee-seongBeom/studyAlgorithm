class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int cnt = 1;

        while(true){
            if(n%cnt == 1) break;
            
            cnt++;
            
        }
        
        return cnt;
    }
}