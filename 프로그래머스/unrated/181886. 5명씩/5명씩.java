class Solution {
    public String[] solution(String[] names) {
        int a = 0;
        
        if(names.length%5 == 0){
            a = names.length/5;
        }else{
            a = names.length/5+1;
        }
        String[] answer = new String[a];
        
        int b = 0;
        for(int i=0; i<a; i++){
            answer[i] = names[i+b];
            b+=4;
        }
        
        
        return answer;
    }
}