class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
                
         
        answer = Integer.valueOf((num1*1000/num2*1000))/1000;
        return answer;
    }
}