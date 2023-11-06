class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        
        String[] arr = str.split("");
        
        int[] answer = new int[arr.length];
        
        int cnt = arr.length-1;
        for(int i=0; i<arr.length; i++){
            answer[i] = Integer.parseInt(arr[cnt-i]);
        }        
        
        return answer;
    }
}