import java.util.*;
class Solution {
    public ArrayList solution(String[] strArr) {
        ArrayList arr = new ArrayList();
        
        for(String s : strArr){
            if(!s.contains("ad")){
               arr.add(s);
            }
        }
        
        return arr;
    }
}