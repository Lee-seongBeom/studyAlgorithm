class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        String a = "Kim";
        int i=0;
        
        try{
            for (i = 0; i < seoul.length; i++) {
                if (seoul[i].equals(a) == true) {
                    break;
                }
            }
        }catch(NullPointerException e){
            
        }
        answer = "김서방은 "+i+"에 있다";
        return answer;
    }
}