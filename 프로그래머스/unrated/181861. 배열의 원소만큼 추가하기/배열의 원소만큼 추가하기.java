import java.util.*;
class Solution {
    public ArrayList solution(int[] arr) {
        ArrayList arr1 = new ArrayList();
        for(int a : arr){
            for(int b=0; b<a; b++){
                arr1.add(a);
            }
        }
        
        return arr1;
    }
}