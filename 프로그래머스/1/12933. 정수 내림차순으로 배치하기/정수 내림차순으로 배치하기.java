import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] arr = Long.toString(n).split("");
        
        Long[] longArr = new Long[arr.length];
        
        for(int i=0; i<arr.length; i++){
            longArr[i] = Long.parseLong(arr[i]);
        }
        
        Arrays.sort(longArr, Collections.reverseOrder());
        
        for(int i=0; i<longArr.length; i++){
            answer+= longArr[i]*(Math.pow(10,longArr.length-1 - i));
        }
        
        
        return answer;
    }
}