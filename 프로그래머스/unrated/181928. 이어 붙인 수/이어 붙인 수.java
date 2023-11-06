class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String j = "";
        String h = "";
        
        for(int a : num_list){
            if(a%2 == 0){
                j += ""+a;
            }else{
                h += ""+a;
            }
        }
        answer = Integer.parseInt(j)+Integer.parseInt(h);
        
        return answer;
    }
}