class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int pow = 1;
        
        for(int a : num_list){
            
            
            sum += a;
            pow = a*pow;
        }
        sum = sum*sum;
        
        if(pow < sum){
            answer = 1;
        }else{
            answer = 0;
        }
        
        return answer;
    }
}