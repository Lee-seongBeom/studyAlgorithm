class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int a = num_list[num_list.length-2];
        int b = num_list[num_list.length-1];
        
        int result = 0;
        if(b > a){
            result = b-a;
        }else{
            result = b*2;
        }
        
        for(int i=0; i<answer.length; i++){
            if(i >= num_list.length){
                answer[i] = result;
            }else{
                answer[i] = num_list[i];
            }
        }
        
        
        return answer;
    }
}