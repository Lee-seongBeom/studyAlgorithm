class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int cnt = 0;
        boolean flag = true;
        while(true){
            if(a<b){
                if(flag){
                    cnt = a;
                    flag = false;
                }
                
                answer += cnt;
                cnt ++;
                if(cnt == b+1) break;
            }else if(a>b){
                if(flag){
                    cnt = b;
                    flag = false;
                }
                answer += cnt;
                cnt ++;
                if(cnt == a+1) break;
            }else{
                answer = a;
                break;
            }
        }
        
        
        return answer;
    }
}