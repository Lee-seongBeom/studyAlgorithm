class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int cnt = 0;
        for(int i=n; i<num_list.length; i++){
            answer[cnt] = num_list[i];
            cnt++;
        }
        
        int cnt2 = 0;
        for(int i=cnt; i<answer.length; i++){
            answer[i] = num_list[cnt2];
            cnt2++;
        }
        
        return answer;
    }
}