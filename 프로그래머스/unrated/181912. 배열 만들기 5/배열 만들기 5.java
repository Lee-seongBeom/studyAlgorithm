import java.util.*;

class Solution {
    public ArrayList solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};

        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(String a : intStrs){
            String str = a.substring(s,s+l);
            int intStr = Integer.parseInt(str);
            
            if(k< intStr){
                arr.add(intStr);
            }
        }
        
        
        
        // System.out.println("");
        
        return arr;
    }
}