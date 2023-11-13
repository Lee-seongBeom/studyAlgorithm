class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        boolean flag = false;
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]<0){
                break;  
            }
            answer++;
            
            
            if(i == num_list.length -1 && num_list[i] > 0){
                answer = -1;
            }
            
        }
        
        
        return answer;
    }
}