import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i=0; i<queries.length; i++){
            int box = 0;
            
            for(int j=0; j<2; j++){
                if(j==0){
                    box = arr[queries[i][0]];
                    arr[queries[i][0]] = arr[queries[i][1]];
                }else{
                    arr[queries[i][1]] = box;
                }
            }
        }
        
        return arr;
    }
}