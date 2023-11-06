class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String[] arr = String.valueOf(x).split("");
        
        int plus = 0;
        for(int i=0; i<arr.length; i++){
            plus += Integer.parseInt(arr[i]);
        }
        
        if(x%plus == 0) answer = true;
        else answer = false;
        
        
        
        return answer;
    }
}