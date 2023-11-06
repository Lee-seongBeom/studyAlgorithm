class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int cnt=0;
        int p=0;
        int y=0;
        
        while(true){
            if(s.charAt(cnt)=='p' || s.charAt(cnt)=='P'){
                p++;
            }else if(s.charAt(cnt)=='y' || s.charAt(cnt)=='Y'){
                y++;
            }
            
            if(cnt == s.length()-1){
                break;
            }
            cnt++;
        }
        if(p!=y){
			answer = false;
		}
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        

        return answer;
    }
}