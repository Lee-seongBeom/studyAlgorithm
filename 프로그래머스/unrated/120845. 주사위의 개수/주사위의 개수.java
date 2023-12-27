class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int a = 1;
        for(int i : box){
            a = (i/n) * a;
        }
        
        
        return a;
    }
}