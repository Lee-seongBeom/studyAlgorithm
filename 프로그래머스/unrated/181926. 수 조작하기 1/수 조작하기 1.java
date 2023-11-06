class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        for(char c : control.toCharArray()){
            if('w' == c){
                n += 1;
            }else if('s' == c){
                n -= 1;
            }else if('a' == c){
                n -= 10;
            }else{
                n += 10;
            }
        }
        
        return n;
    }
}