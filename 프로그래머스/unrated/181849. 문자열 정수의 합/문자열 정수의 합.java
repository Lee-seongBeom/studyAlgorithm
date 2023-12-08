class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] list = num_str.split("");
        for(String s : list){
            answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}