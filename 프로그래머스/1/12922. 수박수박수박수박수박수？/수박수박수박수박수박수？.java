class Solution {
    public String solution(int n) {
        String answer = "";
        int cnt=0;
        
        
        while(true){
            
            
            if(cnt==n){
                break;
            }
            
            if(cnt%2==0){
                answer+="수";
                cnt++;
            }else if(cnt%2==1){
                answer+="박";
                cnt++;
            }
            
            
        }
        return answer;
    }
}