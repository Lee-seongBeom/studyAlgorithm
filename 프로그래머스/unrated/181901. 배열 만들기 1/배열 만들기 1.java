import java.util.*;

class Solution {
    public ArrayList solution(int n, int k) {
        ArrayList arr = new ArrayList();
        
        for(int i=0; i<(n/k); i++){
            arr.add((i+1)*k);
        }
        
        return arr;
    }
}