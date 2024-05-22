class Solution {
    public String solution(int age) {
        String answer = "";
        String a = age + "";
        
        for(String str : a.split("")){
            int n = Integer.parseInt(str);
            if(n == 0){answer += "a";}
            else if(n == 1){answer += "b";}
            else if(n == 2){answer += "c";}
            else if(n == 3){answer += "d";}
            else if(n == 4){answer += "e";}
            else if(n == 5){answer += "f";}
            else if(n == 6){answer += "g";}
            else if(n == 7){answer += "h";}
            else if(n == 8){answer += "i";}
            else if(n == 9){answer += "j";}
        }
        
        return answer;
    }
}