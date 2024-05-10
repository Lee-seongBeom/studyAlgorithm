class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ",-1);
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length(); j++){
                if(j%2 == 0){
                    answer += (arr[i].charAt(j)+"").toUpperCase();
                }else{
                    answer += (arr[i].charAt(j)+"").toLowerCase();
                }
            }
            
            if(arr.length - i > 1){
                answer += " ";    
            }
            
        }
        
        
        
        
        return answer;
    }
}