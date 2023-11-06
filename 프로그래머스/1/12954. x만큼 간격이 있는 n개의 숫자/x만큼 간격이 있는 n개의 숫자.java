class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        
        int cnt=1;
        for(int i=0;i<n;i++){
            long su=0;
            su=x*cnt;
            answer[i] = su;
            cnt++;
        }
        
        return answer;
    }
}