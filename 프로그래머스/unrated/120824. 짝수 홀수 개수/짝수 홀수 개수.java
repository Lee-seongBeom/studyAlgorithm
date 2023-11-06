class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int f=0, s=0;
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2 == 0){
                f++;
            }else{
                s++;
            }
        }
        answer[0] = f;
        answer[1] = s;
        
        
        
        return answer;
    }
}