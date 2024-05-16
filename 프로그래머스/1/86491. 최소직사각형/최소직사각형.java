class Solution {
    public int solution(int[][] sizes) {
        int box = 0;
        int bigX = 0;
        int bigY = 0;
        
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                box = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = box;
            }
            
            if(i == 0){
                bigX = sizes[i][0];
                bigY = sizes[i][1];
            }else{
                if(bigX < sizes[i][0]){
                    bigX = sizes[i][0];
                }
                
                if(bigY < sizes[i][1]){
                    bigY = sizes[i][1];
                }
            }
            
        }
        
        
        return bigX * bigY;
    }
}