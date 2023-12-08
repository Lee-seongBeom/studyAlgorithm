class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        int cnt = 0;
        for(int i=0; i<numbers.length; i++){
            cnt += numbers[i];
            if(cnt > n){
                answer = cnt;
                break;
            }
        }
        
        return answer;
    }
}