class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String a = my_string.replaceAll("[^0-9]","");
        
        String[] arr = a.split("");
        
        for(int i=0; i<arr.length; i++){
            answer += Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}