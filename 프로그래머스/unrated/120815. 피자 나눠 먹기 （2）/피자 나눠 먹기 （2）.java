class Solution {
    public int solution(int n) {
        int answer = 0;
        System.out.println(n);
        
        int piz = 6;
        
        while(true){
            answer++;
            if((answer*piz)%n == 0){
                break;
            }
        }
        
        
        return answer;
    }
}