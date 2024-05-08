import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int total = 0;
        Arrays.sort(d);
        for(int i : d){
            total += i;
            if(budget < total){
                break;
            }else{
                answer++;
            }
        }
        
        
        return answer;
    }
}