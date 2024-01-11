import java.util.*;

class Solution {
    public ArrayList solution(int[] arr, boolean[] flag) {
        ArrayList list = new ArrayList();
        
        for(int i=0; i<arr.length; i++){
            if(flag[i]){
                
                for(int j=0; j<arr[i]*2; j++){
                    list.add(arr[i]);
                }
                
            }else{
                for(int j=0; j<arr[i]; j++){
                    list.remove(list.size()-1);
                }
                
            }
            
        }        
        return list;
    }
}