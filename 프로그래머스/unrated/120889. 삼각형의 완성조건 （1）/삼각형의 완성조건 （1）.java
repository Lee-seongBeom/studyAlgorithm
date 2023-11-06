import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = Arrays.stream(sides).max().getAsInt();
        int all = 0;
        
        boolean flag = true;
        
        for(int i=0; i<sides.length; i++){
            all += sides[i];
        }
        
        
        
        
        if(all > 2*max) answer = 1;
        else answer = 2;
        
        return answer;
    }
}