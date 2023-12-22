class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        boolean flag = true;
        for(int i=idx; i<arr.length; i++){
            if(arr[i] == 1){
                flag = false;
                return answer = i;
            }
        }
        if(flag) answer = -1;
            
        return answer;
    }
}