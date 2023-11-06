class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        if(n%2 != 0){
            cnt = 1;   
        }
        
        int[] answer = new int[n/2 + cnt];
        
        
        int a = 0;
        for(int i=1;i<=n; i+=2){
            answer[a] = i;
            a++;
        }
        
        return answer;
    }
}