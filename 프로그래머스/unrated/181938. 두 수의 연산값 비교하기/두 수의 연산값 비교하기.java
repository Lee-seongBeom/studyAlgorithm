class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = ""+a+b;
        int intAB = Integer.parseInt(ab);
        int ab2 = 2*a*b;
        if (intAB >= ab2){
            answer = intAB;
        }else{
            answer = ab2;
        }
        
        return answer;
    }
}