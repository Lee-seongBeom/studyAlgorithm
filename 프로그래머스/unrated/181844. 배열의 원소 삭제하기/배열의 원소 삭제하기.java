import java.util.*;
class Solution {
    public ArrayList solution(int[] arr, int[] delete_list) {
        ArrayList list = new ArrayList();
        
        boolean bool = true;
        
        for(int i=0; i<arr.length; i++){
            bool = true;
            
            for(int j=0; j<delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    bool = false;
                }
            }
            if(bool){
                list.add(arr[i]);
            }
        }
        
        return list;
    }
}