class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        
        int a = arr[0].length;
        int b = arr.length;
        
        if(a > b){
            answer = new int[a][a];
            for(int i=0; i<a; i++){
                for(int j=0; j<a; j++){
                    if(i >= b){
                        answer[i][j] = 0;
                    }else{
                        answer[i][j] = arr[i][j];
                    }
                }
            }
        }else if(a < b){
            answer = new int[b][b];
            for(int i=0; i<b; i++){
                for(int j=0; j<b; j++){
                    if(j >= a){
                        answer[i][j] = 0;
                    }else{
                        answer[i][j] = arr[i][j];
                    }
                    
                    
                }
            }
        }else{
            return arr;
        }
        
        return answer;
    }
}