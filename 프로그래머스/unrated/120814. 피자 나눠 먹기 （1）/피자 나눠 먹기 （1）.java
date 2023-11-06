class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // System.out.println(n);
        
        if(n%7 == 0){
            answer=n/7;
        }else{
            answer=n/7+1;
        }
        
        
        
        return answer;
    }
}