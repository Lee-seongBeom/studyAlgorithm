import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        List<Integer> arr = new ArrayList<Integer>();
        
        for(int i : numbers){
            arr.add(i);
        }
        
        Collections.sort(arr);
        
        int a = arr.get(0) * arr.get(1);
        int b = arr.get(arr.size()-1) * arr.get(arr.size()-2);
        answer =  a > b ? a : b;
        
        return answer;
    }
}