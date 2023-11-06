import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                cnt ++;
            }
        }
        
        int[] answer = new int[1];
        
        if(cnt == 0){
            answer[0] = -1;
        }else{
            answer = new int[cnt];    
            cnt = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]%divisor == 0){
                    answer[cnt] = arr[i];
                    cnt++;
                }
            }

            Arrays.sort(answer);
        }
        
        
        
        
        return answer;
    }
}