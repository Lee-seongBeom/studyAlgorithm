class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int cnt = 0;
        while(true){
           
            if(money < 5500){
                break;
            }
            cnt++;
            money -= 5500;    
            
            
        }
        answer[0] = cnt;
        answer[1] = money;
        
        return answer;
    }
}