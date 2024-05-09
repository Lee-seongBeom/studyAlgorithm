class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long pLong = Long.parseLong(p);
        
        
        for(int i=0; i<=t.length()-p.length(); i++){
            Long temp = Long.parseLong(t.substring(i,p.length()+i));
            if(temp <= pLong){
                answer++;
            }
            
        }
        
        return answer;
    }
}